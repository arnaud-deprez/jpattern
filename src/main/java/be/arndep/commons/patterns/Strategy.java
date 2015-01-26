package be.arndep.commons.patterns;

/**
 * Created by Arnaud on 12-08-14.
 *
 * {@inheritDoc}
 */
@FunctionalInterface
public interface Strategy<E, R> extends ThrowableStrategy<E, R, RuntimeException> {
	
}
