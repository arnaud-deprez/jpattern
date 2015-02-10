package be.arndep.commons.patterns.specifications;

import org.junit.Before;
import org.junit.Test;

import java.util.function.Predicate;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class NotSpecificationTest {
    private Predicate<Object> allwaysTrue;
    private Predicate<Object> allwaysFalse;

    @Before
    public void setUp() {
        allwaysTrue = (Object o) -> true;
        allwaysFalse = (Object o) -> false;
    }

    @Test
    public void testChaining() {
        assertFalse(allwaysTrue.negate().test(new Object()));
        assertTrue(allwaysTrue.negate().negate().test(new Object()));
        assertTrue(allwaysFalse.negate().test(new Object()));
        assertFalse(allwaysFalse.negate().negate().test(new Object()));
    }

}