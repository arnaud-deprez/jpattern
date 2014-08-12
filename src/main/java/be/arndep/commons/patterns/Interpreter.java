package be.arndep.commons.patterns;

/**
 * Created by Arnaud on 12-08-14.
 * This is an helper interface for Interpreter pattern
 * http://www.oodesign.com/interpreter-pattern.html
 *
 * @param <R>
 * @param <E>
 * @param <T>
 */
public interface Interpreter<R, E, T extends Throwable> {
    /**
     * Interpret the expression
     * @param element
     * @return
     * @throws T
     */
    R interprete(E element) throws T;
}
