import java.util.ArrayList;
import java.util.Arrays;

public class MyList<E> {
    int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public void add(int index, E element) {
        if (index < 0 || index > elements.length) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
        } else {
            if (size == elements.length) {
                ensureCapa();
            }
            elements[index] = element;
        }
    }

    public int size() {
        size = elements.length;
        return size;
    }

    public Object[] clone() {
        Object elementsClone = new Object[elements.length];
        return (Object[]) elementsClone;
    }

    public boolean contains(E o) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == o) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E o) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == o) {
                return i;
            }
        }
        return -1;
    }

    public boolean add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
        return true;
    }

    public void ensureCapacity(int minCapacity) {
        int newSize = minCapacity;
        elements = Arrays.copyOf(elements, minCapacity);
    }

    public E get(int index) {
        if (index < 0 || index >= elements.length) {
            throw new IndexOutOfBoundsException();
        } else {
            return (E) elements[index];
        }
    }

    public void clear() {
        elements = new Object[elements.length];
    }



}
