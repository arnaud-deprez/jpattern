package be.arndep.commons.patterns.specifications;

import java.util.function.Predicate;

/**
 * Created by Arnaud on 04-10-14.
 */
public class AllwaysTrueSpecification<T> implements Predicate<T> {
    @Override
    public boolean test(T t) {
        return true;
    }
}
