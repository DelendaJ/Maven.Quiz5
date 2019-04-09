package rocks.zipcode.io.quiz4.generics;

/**
 * @author leon on 18/12/2018.
 */
public class SortedGroup<_> extends Group<_> {
    @Override
    public void insert(_ value) {
        anArrList.add(value);
    }

    public void delete(Object value) {
        anArrList.remove(value);
    }

    public Integer indexOf(Object value) {
        return anArrList.indexOf(value);
    }
}
