package be.arndep.commons.patterns;

/**
 * Created by Arnaud on 12-08-14.
 * This is an helper class for the memento pattern
 * http://www.oodesign.com/memento-pattern.html
 *
 * @param <S>
 */
public abstract class AbstractMemento<S> {
    private S state;

    /**
     * Constructor to keep a state
     * @param state
     */
    public AbstractMemento(final S state) {
        this.state = state;
    }

    /**
     * Get the current state
     * @return
     */
    public S getState() {
        return state;
    }
}
