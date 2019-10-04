package by.pepega.algorithm.algorithms.sort;

import by.pepega.algorithm.algorithms.Algorithm;
import by.pepega.algorithm.structures.Array;

public interface SortAlgorithm<T extends Comparable<T>> extends Algorithm {

    default Array<T> sort(Array<T> array) {
        return sort(array, SortDirection.ASC);
    }

    Array<T> sort(Array<T> array, SortDirection sortDirection);

}
