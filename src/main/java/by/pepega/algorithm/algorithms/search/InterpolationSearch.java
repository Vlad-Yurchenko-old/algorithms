package by.pepega.algorithm.algorithms.search;

import by.pepega.algorithm.structures.Array;

public class InterpolationSearch<T extends Comparable<T>> implements SearchAlgorithm<T> {

    @Override
    public String getName() {
        return "Interpolation search";
    }


    @Override
    public int search(Array<T> elements, T element) {
        return -1;
    }

}
