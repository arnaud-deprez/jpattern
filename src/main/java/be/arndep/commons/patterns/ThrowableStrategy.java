package be.arndep.commons.patterns;

/**
 * @author arnaud.deprez on 04.12.14.
 * This is an helper interface to represent a strategy
 *
 * @param <R>
 * @param <E>
 * @param <T>
 */
@FunctionalInterface
public interface ThrowableStrategy<E, R, T extends Throwable> {
    /**
     * Execute the current strategy
     * @param element
     * @return
     * @throws T
     */
    R execute(E element) throws T;
}
