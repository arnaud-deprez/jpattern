package be.arndep.commons.patterns;

/**
 * Created by Arnaud on 12-08-14.
 *
 * @param <R> The result
 * @param <T> The exception thrown
 */
public interface Builder<R, T extends Throwable> {
    /**
     *
     * @return
     * @throws T
     */
    R build() throws T;
}
