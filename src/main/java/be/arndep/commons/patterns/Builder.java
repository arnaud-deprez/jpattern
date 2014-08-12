package be.arndep.commons.patterns;

/**
 * Created by Arnaud on 12-08-14.
 * This an Helper interface for the Builder pattern
 * http://www.oodesign.com/builder-pattern.html
 *
 * @param <R> The result
 * @param <T> The exception thrown
 */
public interface Builder<R, T extends Throwable> {
    /**
     * This method is used to build the result
     * @return
     * @throws T
     */
    R build() throws T;
}
