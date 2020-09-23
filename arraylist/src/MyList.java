import java.util.Arrays;

public class MyList {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(int e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }
    public int get(int i){
        if (i>=size||i<0){
            throw new IndexOutOfBoundsException("Index: "+i+", Size "+i);
        }
        return (int)elements[i];
    }


}
