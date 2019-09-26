package by.pepega.algorithm.algorithms.search;

import by.pepega.algorithm.algorithms.Algorithm;
import by.pepega.algorithm.structures.Array;

public interface SearchAlgorithm<T extends Comparable<T>> extends Algorithm {

    int search(Array<T> elements, T element);

}
