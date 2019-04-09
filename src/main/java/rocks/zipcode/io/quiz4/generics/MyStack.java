package rocks.zipcode.io.quiz4.generics;

import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.Stack;

/**
 * @author leon on 11/12/2018.
 */
public class MyStack<SomeType> implements Iterable {
    Stack<SomeType> stackittyStackStack;

    public MyStack() {
        stackittyStackStack = new Stack<>();

    }

    public Boolean isEmpty() {

        return (stackittyStackStack.isEmpty());
    }

    public void push(SomeType i) {
        stackittyStackStack.push(i);
    }

    public SomeType peek() {

        return stackittyStackStack.peek();
    }


    public SomeType pop() {
        return stackittyStackStack.pop();
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}
