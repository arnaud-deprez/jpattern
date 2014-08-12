package be.arndep.commons.patterns;

import java.util.Optional;

/**
 * Created by Arnaud on 12-08-14.
 *
 * @param <E>
 */
public abstract class AbstractHandler<E> {
    private Optional<AbstractHandler> successsor;

    /**
     *
     * @param successsor
     */
    public void setSuccesssor(Optional<AbstractHandler> successsor) {
        this.successsor = successsor;
    }

    /**
     *
     * @param request
     */
    public final void handleRequest(final E request){
        successsor.ifPresent(c -> {
            boolean handleByThisNode = this.handleRequestImpl(request);
            if (!handleByThisNode)
                c.handleRequest(request);
        });
    }

    /**
     * Implementation of handleRequest
     * @param request
     * @return
     */
    protected abstract boolean handleRequestImpl(E request);
}
