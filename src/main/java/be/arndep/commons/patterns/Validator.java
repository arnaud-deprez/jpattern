package be.arndep.commons.patterns;

/**
 * Created by Arnaud on 12-08-14.
 *
 * {@inheritDoc}
 */
@FunctionalInterface
public interface Validator<E, R> extends ThrowableValidator<E, R, RuntimeException> {
}
