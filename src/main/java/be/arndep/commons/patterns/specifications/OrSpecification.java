package be.arndep.commons.patterns.specifications;

/**
 * Created by Arnaud on 04-10-14.
 * AND specification, used to create a new specification that is the AND of two other specifications.
 */
public class OrSpecification<T> extends AbstractSpecification<T> {
    private final Specification<T> left;
    private final Specification<T> right;

    /**
     * Create a new OR specification based on 2 other specifications
     * @param left
     * @param right
     */
    protected OrSpecification(final Specification<T> left, final Specification<T> right) {
        this.left = left;
        this.right = right;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isSatisfiedBy(final T t) {
        return left.isSatisfiedBy(t) || right.isSatisfiedBy(t);
    }
}
