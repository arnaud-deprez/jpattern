package be.arndep.commons.patterns;

/**
 * Created by arnaud on 20.10.14.
 * This is an Helper abstract class for the Builder pattern which allows us to build a hierarchy of builders (inheritance)
 *
 * @param <R>
 * @param <B>
 */
public abstract class AbstractGenericBuilder<R, B extends AbstractGenericBuilder<R, B>> implements Builder<R> {
    /**
     * Method helper to return the actual builder
     * @return
     */
    protected abstract B self();
}
