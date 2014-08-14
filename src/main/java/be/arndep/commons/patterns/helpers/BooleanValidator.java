package be.arndep.commons.patterns.helpers;

import be.arndep.commons.patterns.Validator;

/**
 * Created by Arnaud on 12-08-14.
 * This is an helper interface to represent classical validation strategy
 * that returns true or false depending if the element is valid or not
 *
 * @param <E>
 */
public interface BooleanValidator<E> extends Validator<Boolean, E, RuntimeException>
{
}
