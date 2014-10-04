package be.arndep.commons.patterns.specifications;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NotSpecificationTest {
    private Specification<Object> allwaysTrue;
    private Specification<Object> allwaysFalse;

    @Before
    public void setUp() {
        allwaysTrue = new AllwaysTrueSpecification<>();
        allwaysFalse = new AllwaysFalseSpecification<>();
    }

    @Test
    public void testIsSatisfiedBy() throws Exception {
        NotSpecification<Object> notSpecification = new NotSpecification<>(allwaysTrue);
        assertFalse(notSpecification.isSatisfiedBy(new Object()));

        notSpecification = new NotSpecification<>(allwaysFalse);
        assertTrue(notSpecification.isSatisfiedBy(new Object()));
    }

    @Test
    public void testChaining() {
        assertFalse(allwaysTrue.not().isSatisfiedBy(new Object()));
        assertTrue(allwaysTrue.not().not().isSatisfiedBy(new Object()));
        assertTrue(allwaysFalse.not().isSatisfiedBy(new Object()));
        assertFalse(allwaysFalse.not().not().isSatisfiedBy(new Object()));
    }

}