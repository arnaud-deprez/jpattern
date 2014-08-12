package be.arndep.commons.patterns;

/**
 * Created by Arnaud on 12-08-14.
 *
 * @param <E> The element parameter
 * @param <R> The result
 */
public interface Factory<R, E> {
    /**
     *
     * @param element
     * @return
     */
    R create(E element);
}
