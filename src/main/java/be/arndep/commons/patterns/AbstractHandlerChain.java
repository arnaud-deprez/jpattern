package be.arndep.commons.patterns;

import java.util.Optional;

/**
 * Created by Arnaud on 12-08-14.
 * This is an helper class for the Chain of Responsibility pattern
 * http://www.oodesign.com/chain-of-responsibility-pattern.html
 *
 * @param <E>
 */
public abstract class AbstractHandlerChain<E> {
    private Optional<AbstractHandlerChain<E>> successsor;

    /**
     * Default constructor without successor
     */
    public AbstractHandlerChain() {
        successsor = Optional.empty();
    }

	/**
	 * Configure the successor
	 * @param successor
	 * @return
	 */
	public AbstractHandlerChain<E> setSuccessor(final AbstractHandlerChain<E> successor) {
		this.successsor = Optional.of(successor);
		return this.successsor.get();
	}

    /**
     * This public method handle the given element
     * @param element
     */
    public final void handle(final E element){
       final  boolean handleByThisNode = this.handleImpl(element);
        successsor.ifPresent(s -> {
            if (!handleByThisNode)
                s.handle(element);
        });
    }

    /**
     * This is the implementation of handle.
     * This method should be overriten for each implementation.
     * @param request
     * @return true to break the chain, false otherwise
     */
    protected abstract boolean handleImpl(final E request);
}
