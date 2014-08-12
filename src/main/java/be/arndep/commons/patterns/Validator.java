package be.arndep.commons.patterns;

/**
 * Created by Arnaud on 12-08-14.
 *
 * @param <R>
 * @param <E>
 * @param <T>
 */
public interface Validator<R, E, T extends Throwable> {
    /**
     *
     * @param element
     * @return
     * @throws T
     */
    R validate(E element) throws T;
}
