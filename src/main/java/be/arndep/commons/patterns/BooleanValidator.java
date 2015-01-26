package be.arndep.commons.patterns;

/**
 * Created by Arnaud on 12-08-14.
 * This is an helper interface to represent classical validation strategy
 * that returns true or false depending if the element is valid or not
 *
 * @param <E>
 */
@FunctionalInterface
public interface BooleanValidator<E> extends Validator<E, Boolean>
{
}
