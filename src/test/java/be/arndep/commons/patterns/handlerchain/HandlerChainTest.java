package be.arndep.commons.patterns.handlerchain;

import org.junit.Before;
import org.junit.Test;

import java.util.function.Function;
import java.util.function.UnaryOperator;

import static junit.framework.TestCase.assertEquals;

public class HandlerChainTest {
    private static enum KindNumber {
        ZERO,
        NEGATIVE,
        POSITIVE
    }

    private Function<String, String> letterChain;

    @Before
    public void setUp() {
        UnaryOperator<String> header = s -> "Dear,\n\n" + s;
        UnaryOperator<String> footer = s -> s + "\n\nRegards,";
        UnaryOperator<String> signature = s -> s + "\n\nArnaud Deprez";
        letterChain = header.andThen(footer).andThen(signature);
    }

    @Test
    public void testHandleRequest() throws Exception {
        String letter = letterChain.apply("Would you like to accept my request ?");
        System.out.println(letter);
        assertEquals("Dear,\n\nWould you like to accept my request ?\n\nRegards,\n\nArnaud Deprez", letter);
    }
}