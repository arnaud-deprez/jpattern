package be.arndep.commons.patterns.specifications;

import org.junit.Before;
import org.junit.Test;

import java.util.function.Predicate;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class OrSpecificationTest {
    private Predicate<Object> allwaysTrue;
    private Predicate<Object> allwaysFalse;

    @Before
    public void setUp() {
        allwaysTrue = new AllwaysTrueSpecification<>();
        allwaysFalse = new AllwaysFalseSpecification<>();
    }

    @Test
    public void testChaining() {
        assertTrue(allwaysTrue.or(allwaysTrue).test(new Object()));
        assertTrue(allwaysTrue.or(allwaysFalse).test(new Object()));
        assertTrue(allwaysFalse.or(allwaysTrue).test(new Object()));
        assertFalse(allwaysFalse.or(allwaysFalse).test(new Object()));
    }
}