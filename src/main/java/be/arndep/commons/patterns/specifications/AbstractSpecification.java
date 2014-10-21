package be.arndep.commons.patterns.specifications;

/**
 * Created by Arnaud on 04-10-14.
 * Abstract base implementation of composite {@link Specification} with default
 * implementations for {@code and}, {@code or} and {@code not}.
 */
public abstract class AbstractSpecification<T> implements Specification<T> {
    /**
     * {@inheritDoc}
     */
    @Override
    public abstract boolean isSatisfiedBy(T t);

    /**
     * {@inheritDoc}
     */
    @Override
    public Specification<T> and(final Specification<T> specification) {
        return new AndSpecification<>(this, specification);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Specification<T> or(final Specification<T> specification) {
        return new OrSpecification<>(this, specification);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Specification<T> not() {
        return new NotSpecification<>(this);
    }
}
