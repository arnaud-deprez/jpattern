package be.arndep.commons.patterns;

/**
 * Created by Arnaud on 12-08-14.
 * This is an interface to represent an identifiable Object
 *
 * @param <K>
 */
public interface Identifiable<K> {
    /**
     * Get the id of the Identifiable Object
     * @return
     */
    K getId();
}
