package be.arndep.commons.patterns;

/**
 * @author arnaud.deprez on 04.12.14.
 */
@FunctionalInterface
public interface ThrowableInterpreter<E, R, T extends Throwable> {
    /**
     * Interpret the expression
     * @param element
     * @return
     * @throws T
     */
    R interprete(E element) throws T;
}
