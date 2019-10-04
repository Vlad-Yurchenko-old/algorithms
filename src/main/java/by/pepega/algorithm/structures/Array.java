package by.pepega.algorithm.structures;

import java.util.Arrays;

@SuppressWarnings({"unchecked", "unused"})
public class Array<T> {

    private Object[] elements;


    public Array(int capacity) {
        this.elements = new Object[capacity];
    }


    public Array(T[] elements) {
        this.elements = elements;
    }


    public int size() {
        return this.elements.length;
    }

    public T get(int index) {
        return (T) elements[index];
    }

    public void set(int index, T element) {
        this.elements[index] = element;
    }


    @Override
    public String toString() {
        return "Array{" +
                "elements=" + Arrays.toString(elements) +
                '}';
    }
}
