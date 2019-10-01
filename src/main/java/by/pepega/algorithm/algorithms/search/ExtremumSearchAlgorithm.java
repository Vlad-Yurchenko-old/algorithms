package by.pepega.algorithm.algorithms.search;

import by.pepega.algorithm.algorithms.Algorithm;

import java.util.function.Function;

public interface ExtremumSearchAlgorithm<T> extends Algorithm {

    T searchMin(Function<T, T> function, T from, T to, double accuracy);

    T searchMax(Function<T, T> function, T from, T to, double accuracy);

}
