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
     * Set the successor if needed
     * @param successsor
     */
    public void setSuccesssor(Optional<AbstractHandler> successsor) {
        this.successsor = successsor;
    }

    /**
     * This method handle the request
     * @param request
     */
    public final void handleRequest(final E request){
        successsor.ifPresent(s -> {
            boolean handleByThisNode = this.handleRequestImpl(request);
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
