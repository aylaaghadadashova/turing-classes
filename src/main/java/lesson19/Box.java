package lesson19;

public abstract class Box<T, E> {
    T element;
    E count;

    public Box(T element, E count) {
        this.element = element;
        this.count = count;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public E getCount() {
        return count;
    }

    public void setCount(E count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Box{" + "\n" +
                "element=" + element + "\n" +
                "count=" + count + "\n" +
                '}';
    }
}
