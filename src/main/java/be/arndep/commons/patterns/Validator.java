package be.arndep.commons.patterns;

/**
 * Created by Arnaud on 12-08-14.
 * This is an helper interface to represent a validation strategy
 *
 * @param <R>
 * @param <E>
 */
public interface Validator<R, E> {
    /**
     * Validate the element
     * @param element
     * @return The result of the validation
     */
    R validate(E element);
}
