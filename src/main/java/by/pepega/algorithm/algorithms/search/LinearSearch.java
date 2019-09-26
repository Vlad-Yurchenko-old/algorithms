package by.pepega.algorithm.algorithms.search;

import by.pepega.algorithm.structures.Array;

public class LinearSearch<T extends Comparable<T>> implements SearchAlgorithm<T> {

    @Override
    public String getName() {
        return "Linear search";
    }


    @Override
    public int search(Array<T> elements, T element) {
        for (int i = 0; i < elements.size(); i++) {
            if (elements.get(i).compareTo(element) == 0) {
                return i;
            }
        }
        return -1;
    }

}
