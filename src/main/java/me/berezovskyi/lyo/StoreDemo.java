package me.berezovskyi.lyo;

import org.eclipse.lyo.store.Store;
import org.eclipse.lyo.store.StoreFactory;

/**
 * Created on 2018-03-02
 *
 * @author Andrew Berezovskyi (andriib@kth.se)
 * @version $version-stub$
 * @since 0.0.1
 */
public class StoreDemo {
    public static void main(String[] args) {
        System.out.println("Creating in-memory Store instance");
        final Store store = StoreFactory.inMemory();
        System.out.println("Created a Store instance! Removing all triples...");
        store.removeAll();
        System.out.println("In-memory triplestore was cleared");
    }
}
