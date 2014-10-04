package be.arndep.commons.patterns.specifications;

import org.junit.Before;
import org.junit.Test;

import java.util.Objects;

import static org.junit.Assert.*;

public class AndSpecificationTest {
    private Specification<Object> allwaysTrue;
    private Specification<Object> allwaysFalse;

    @Before
    public void setUp() {
        allwaysTrue = new AllwaysTrueSpecification<>();
        allwaysFalse = new AllwaysFalseSpecification<>();
    }

    @Test
    public void testIsSatisfiedBy() throws Exception {
        AndSpecification<Object> andSpecification = new AndSpecification<>(allwaysTrue, allwaysTrue);
        assertTrue(andSpecification.isSatisfiedBy(new Object()));

        andSpecification = new AndSpecification<>(allwaysTrue, allwaysFalse);
        assertFalse(andSpecification.isSatisfiedBy(new Object()));

        andSpecification = new AndSpecification<>(allwaysFalse, allwaysTrue);
        assertFalse(andSpecification.isSatisfiedBy(new Object()));

        andSpecification = new AndSpecification<>(allwaysFalse, allwaysFalse);
        assertFalse(andSpecification.isSatisfiedBy(new Object()));
    }

    @Test
    public void testChaining() {
        assertTrue(allwaysTrue.and(allwaysTrue).isSatisfiedBy(new Object()));
        assertFalse(allwaysTrue.and(allwaysFalse).isSatisfiedBy(new Object()));
        assertFalse(allwaysFalse.and(allwaysTrue).isSatisfiedBy(new Object()));
        assertFalse(allwaysFalse.and(allwaysFalse).isSatisfiedBy(new Object()));
    }
}