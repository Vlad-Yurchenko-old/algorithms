package by.pepega.algorithm.algorithms.search.impl;

import by.pepega.algorithm.algorithms.search.SearchAlgorithm;
import by.pepega.algorithm.structures.Array;

@SuppressWarnings("Duplicates")
public class InterpolationSearch implements SearchAlgorithm<Integer> {

    @Override
    public String getName() {
        return "Interpolation search";
    }


    @Override
    public int search(Array<Integer> elements, Integer element) {
        return search(0, elements.size() - 1, elements, element);
    }

    private int search(int from, int to, Array<Integer> elements, Integer element) {

        int middlePosition = from + (element - elements.get(from)) / (elements.get(to) - elements.get(from)) * (to - from);

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
