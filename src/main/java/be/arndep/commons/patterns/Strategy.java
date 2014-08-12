package be.arndep.commons.patterns;

/**
 * Created by Arnaud on 12-08-14.
 * This is an helper interface to represent a strategy
 *
 * @param <R>
 * @param <E>
 * @param <T>
 */
public interface Strategy<R, E, T extends Throwable> {
    /**
     * Execute the current strategy
     * @param element
     * @return
     * @throws T
     */
    R execute(E element) throws T;
}
