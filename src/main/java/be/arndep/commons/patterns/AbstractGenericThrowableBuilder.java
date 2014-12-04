package be.arndep.commons.patterns;

/**
 * @author arnaud.deprez on 04.12.14.
 */
public abstract class AbstractGenericThrowableBuilder<R, B extends ThrowableBuilder<R, T>, T extends Throwable>
        implements ThrowableBuilder<R, T> {
    /**
     * Helper to get the current object
     * @return this
     */
    protected abstract B self();
}
