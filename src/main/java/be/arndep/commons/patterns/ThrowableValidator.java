package be.arndep.commons.patterns;

/**
 * Created by arnaud on 20.10.14.
 * This is an helper interface to represent a validation strategy which can thrown an exception
 *
 * @param <R>
 * @param <E>
 * @param <T>
 */
public interface ThrowableValidator<R, E, T extends Throwable> {
    /**
     * Validate the element
     * @param element
     * @return result of validation
     * @throws T exception thrown
     */
    R validate(E element) throws T;
}
