package be.arndep.commons.patterns;

/**
 * Created by Arnaud on 12-08-14.
 * This interface is an helper interface to represent a validation strategy
 *
 * @param <R>
 * @param <E>
 * @param <T>
 */
public interface Validator<R, E, T extends Throwable> {
    /**
     * Validate the element
     * @param element
     * @return The result of the validation
     * @throws T
     */
    R validate(E element) throws T;
}
