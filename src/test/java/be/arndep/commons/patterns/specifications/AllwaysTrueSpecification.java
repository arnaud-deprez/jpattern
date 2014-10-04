package be.arndep.commons.patterns.specifications;

/**
 * Created by Arnaud on 04-10-14.
 */
public class AllwaysTrueSpecification<T> extends AbstractSpecification<T> {
    @Override
    public boolean isSatisfiedBy(T t) {
        return true;
    }
}
