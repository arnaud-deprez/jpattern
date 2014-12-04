package be.arndep.commons.patterns;

/**
 * @author arnaud.deprez on 04.12.14.
 * This is an Helper interface for the Builder pattern
 * http://www.oodesign.com/builder-pattern.html
 *
 * @param <R> The result
 * @param <T> The exception
 */
public interface ThrowableBuilder<R, T extends Throwable> {
    /**
     * This method is used to build the result
     * @return
     */
    R build() throws T;
}
