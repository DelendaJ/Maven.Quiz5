package rocks.zipcode.io.quiz4.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * @author leon on 11/12/2018.
 */
public class SimpleStringGroup implements Iterable {
    List<String> anArrList = new ArrayList<>();

    public SimpleStringGroup() {
        // throw new UnsupportedOperationException("Method not yet implemented");
        super();
    }


    public Integer count() {
        return anArrList.size();

    }

    public void insert(String string) {
        anArrList.add(string);
    }

    public Boolean has(String string) {

        return anArrList.contains(string);
    }

    public String fetch(int indexOfValue) {

        return anArrList.get(indexOfValue);
    }

    public void delete(String string) {
        anArrList.remove(string);
    }

    public void clear() {

        anArrList.clear();
    }

    @Override
    public Iterator iterator() {
        return anArrList.iterator();
    }

    @Override
    public void forEach(Consumer action) {
        anArrList.forEach(action);


    }

    @Override
    public Spliterator spliterator() {
        return anArrList.spliterator();
    }
}
