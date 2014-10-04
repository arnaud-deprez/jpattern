package be.arndep.commons.patterns.specifications;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrSpecificationTest {
    private Specification<Object> allwaysTrue;
    private Specification<Object> allwaysFalse;

    @Before
    public void setUp() {
        allwaysTrue = new AllwaysTrueSpecification<>();
        allwaysFalse = new AllwaysFalseSpecification<>();
    }

    @Test
    public void testIsSatisfiedBy() throws Exception {
        OrSpecification<Object> orSpecification = new OrSpecification<>(allwaysTrue, allwaysTrue);
        assertTrue(orSpecification.isSatisfiedBy(new Object()));

        orSpecification = new OrSpecification<>(allwaysTrue, allwaysFalse);
        assertTrue(orSpecification.isSatisfiedBy(new Object()));

        orSpecification = new OrSpecification<>(allwaysFalse, allwaysTrue);
        assertTrue(orSpecification.isSatisfiedBy(new Object()));

        orSpecification = new OrSpecification<>(allwaysFalse, allwaysFalse);
        assertFalse(orSpecification.isSatisfiedBy(new Object()));
    }

    @Test
    public void testChaining() {
        assertTrue(allwaysTrue.or(allwaysTrue).isSatisfiedBy(new Object()));
        assertTrue(allwaysTrue.or(allwaysFalse).isSatisfiedBy(new Object()));
        assertTrue(allwaysFalse.or(allwaysTrue).isSatisfiedBy(new Object()));
        assertFalse(allwaysFalse.or(allwaysFalse).isSatisfiedBy(new Object()));
    }
}