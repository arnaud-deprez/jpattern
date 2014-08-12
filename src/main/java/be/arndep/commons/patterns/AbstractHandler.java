package be.arndep.commons.patterns;

import java.util.Optional;

/**
 * Created by Arnaud on 12-08-14.
 * This is an helper class for the Chain of Responsibility pattern
 * http://www.oodesign.com/chain-of-responsibility-pattern.html
 *
 * @param <E>
 */
public abstract class AbstractHandler<E> {
    private Optional<AbstractHandler> successsor;

    /**
     * Default constructor without successor
     */
    public AbstractHandler() {
        successsor = Optional.empty();
    }

    /**
     * Constructor to use with a successor
     * @param successsor
     */
    public AbstractHandler(final AbstractHandler successsor) {
        this.successsor = Optional.of(successsor);
    }

    /**
     * This method handle the request
     * @param request
     */
    public final void handleRequest(final E request){
       final  boolean handleByThisNode = this.handleRequestImpl(request);
        successsor.ifPresent(s -> {
            if (!handleByThisNode)
                s.handleRequest(request);
        });
    }

    /**
     * This is the implementation of handleRequest.
     * This method should be overriten for each implementation.
     * @param request
     * @return
     */
    protected abstract boolean handleRequestImpl(E request);
}
