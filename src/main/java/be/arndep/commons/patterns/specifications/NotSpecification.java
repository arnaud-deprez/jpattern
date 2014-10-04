package be.arndep.commons.patterns.specifications;

/**
 * Created by Arnaud on 04-10-14.
 * NOT specification, used to create a new specification that is the NOT of the other specification.
 */
public class NotSpecification<T> extends AbstractSpecification<T> {
    private final Specification<T> spec;

    protected NotSpecification(final Specification<T> spec) {
        this.spec = spec;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isSatisfiedBy(final T t) {
        return !spec.isSatisfiedBy(t);
    }
}
