package be.arndep.commons.patterns;

/**
 * Created by Arnaud on 12-08-14.
 * This is an Helper interface for the Builder pattern
 * http://www.oodesign.com/builder-pattern.html
 *
 * @param <R> The result
 */
public interface Builder<R> {
    /**
     * This method is used to build the result
     * @return
     */
    R build();
}
