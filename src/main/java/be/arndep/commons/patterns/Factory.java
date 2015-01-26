package be.arndep.commons.patterns;

/**
 * Created by Arnaud on 12-08-14.
 *
 * {@inheritDoc}
 */
@FunctionalInterface
public interface Factory<E, R> extends ThrowableFactory<E, R, RuntimeException> {
}
