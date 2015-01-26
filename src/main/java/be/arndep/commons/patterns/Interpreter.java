package be.arndep.commons.patterns;

/**
 * Created by Arnaud on 12-08-14.
 *
 * {@inheritDoc}
 */
@FunctionalInterface
public interface Interpreter<E, R> extends ThrowableInterpreter<E, R, RuntimeException> {
}
