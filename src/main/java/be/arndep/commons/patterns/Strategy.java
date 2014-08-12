package be.arndep.commons.patterns;

/**
 * Created by Arnaud on 12-08-14.
 *
 * @param <R>
 * @param <E>
 * @param <T>
 */
public interface Strategy<R, E, T extends Throwable> {
    /**
     *
     * @param element
     * @return
     * @throws T
     */
    R execute(E element) throws T;
}
