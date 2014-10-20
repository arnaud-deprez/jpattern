package be.arndep.commons.patterns;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AbstractHandlerChainTest {
    private static enum KindNumber {
        ZERO,
        NEGATIVE,
        POSITIVE,
        UNDEFINED
    }
    private KindNumber kindNumber;
    private AbstractHandlerChain<Integer> handler;

    @Before
    public void setUp() {
        kindNumber = KindNumber.UNDEFINED;
        handler = new AbstractHandlerChain<Integer>() {
            @Override
            protected boolean handleImpl(Integer request) {
                if (request == 0) {
                    kindNumber = KindNumber.ZERO;
                    return true;
                }
                return false;
            }
        };
        handler
                .setSuccessor(new AbstractHandlerChain<Integer>() {
                    @Override
                    protected boolean handleImpl(Integer request) {
                        if (request < 0) {
                            kindNumber = KindNumber.NEGATIVE;
                            return true;
                        }
                        return false;
                    }
                })
                .setSuccessor(new AbstractHandlerChain<Integer>() {
                    @Override
                    protected boolean handleImpl(Integer request) {
                        if (request > 0) {
                            kindNumber = KindNumber.POSITIVE;
                            return true;
                        }
                        return false;
                    }
                });
    }

    @Test
    public void testHandleRequest() throws Exception {
        handler.handle(0);
        assertEquals(KindNumber.ZERO, kindNumber);

        handler.handle(1);
        assertEquals(KindNumber.POSITIVE, kindNumber);

        handler.handle(-1);
        assertEquals(KindNumber.NEGATIVE, kindNumber);
    }
}