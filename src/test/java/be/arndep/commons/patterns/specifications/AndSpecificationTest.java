package be.arndep.commons.patterns.specifications;

import org.junit.Before;
import org.junit.Test;

import java.util.function.Predicate;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AndSpecificationTest {
    private Predicate<Object> allwaysTrue;
    private Predicate<Object> allwaysFalse;

    @Before
    public void setUp() {
        allwaysTrue = (Object o) -> true;
        allwaysFalse = (Object o) -> false;
    }

    @Test
    public void testChaining() {
        assertTrue(allwaysTrue.and(allwaysTrue).test(new Object()));
        assertFalse(allwaysTrue.and(allwaysFalse).test(new Object()));
        assertFalse(allwaysFalse.and(allwaysTrue).test(new Object()));
        assertFalse(allwaysFalse.and(allwaysFalse).test(new Object()));
    }
}