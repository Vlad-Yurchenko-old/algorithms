package by.pepega.algorithm.algorithms.search;

import by.pepega.algorithm.structures.Array;

public class BinarySearch<T extends Comparable<T>> implements SearchAlgorithm<T> {

    @Override
    public String getName() {
        return "Binary search";
    }


    @Override
    public int search(Array<T> elements, T element) {
        return search(0, elements.size() - 1, elements, element);
    }

    private int search(int from, int to, Array<T> elements, T element) {

        int middlePosition = from + (to - from) / 2;

        int val = element.compareTo(elements.get(middlePosition));

        if (val == 0) {
            return middlePosition;
        } else if (from == to) {
            return -1;
        } else if (val < 0) {
            return search(from, middlePosition - 1, elements, element);
        } else {
            return search(middlePosition + 1, to, elements, element);
        }
    }

}
