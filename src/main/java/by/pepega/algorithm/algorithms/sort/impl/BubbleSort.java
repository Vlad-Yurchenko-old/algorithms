package by.pepega.algorithm.algorithms.sort.impl;

import by.pepega.algorithm.algorithms.sort.SortAlgorithm;
import by.pepega.algorithm.algorithms.sort.SortDirection;
import by.pepega.algorithm.structures.Array;

import java.util.function.BiPredicate;

public class BubbleSort<T extends Comparable<T>> implements SortAlgorithm<T> {

    @Override
    public String getName() {
        return "Bubble sort";
    }


    @Override
    public Array<T> sort(Array<T> array, SortDirection direction) {

        BiPredicate<T, T> biPredicate = direction.equals(SortDirection.ASC)
                ? (a, b) -> a.compareTo(b) > 0
                : (a, b) -> a.compareTo(b) < 0;

        for (int i = 0; i < array.size(); i++) {
            for (int j = i + 1; j < array.size(); j++) {
                if (biPredicate.test(array.get(i), array.get(j))) {
                    T temp = array.get(i);
                    array.set(i, array.get(j));
                    array.set(j, temp);
                }
            }
        }

        return array;
    }

}
