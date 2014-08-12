package be.arndep.commons.patterns;

/**
 * Created by Arnaud on 12-08-14.
 *
 * @param <R>
 * @param <E>
 * @param <T>
 */
public interface Evaluator<R, E, T extends Throwable> {
    /**
     *
     * @param element
     * @return
     * @throws T
     */
    R evaluate(E element) throws T;
}
