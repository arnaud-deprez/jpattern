package be.arndep.commons.patterns;

/**
 * @author arnaud.deprez on 04.12.14.
 *
 * This is an helper interface for the factory pattern
 * http://www.oodesign.com/factory-pattern.html
 * http://www.oodesign.com/factory-method-pattern.html
 * http://www.oodesign.com/abstract-factory-pattern.html
 *
 * @param <E> The element parameter
 * @param <R> The result
 * @param <T> The exception
 */
public interface ThrowableFactory<R, E, T extends Throwable> {
    /**
     * This method is used to create the desired Object
     * @param element
     * @return
     */
    R create(E element);
}
