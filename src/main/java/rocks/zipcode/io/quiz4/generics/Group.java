package rocks.zipcode.io.quiz4.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * @author leon on 18/12/2018.
 */
public class Group<T> implements GroupInterface<T>{
    List<T> anArrList;
    public Group() {
        anArrList = new ArrayList<>();
        //throw new UnsupportedOperationException("Method not yet implemented");
    }

    public Integer count() {
      return anArrList.size();
    }

    public void insert(T value) {
        anArrList.add(value);
    }

    public Boolean has(T value) {
        return anArrList.contains(value);
    }

    public T fetch(int indexOfValue) {
        return anArrList.get(indexOfValue);
    }

    public void delete(T value) {
        anArrList.remove(value);
    }

    public void clear() {
        anArrList.clear();
    }

    public Iterator<T> iterator() {
        return anArrList.iterator();
    }


    @Override
    public String toString() {
        return anArrList.toString();
    }
}
