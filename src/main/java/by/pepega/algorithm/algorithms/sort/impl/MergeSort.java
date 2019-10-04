package by.pepega.algorithm.algorithms.sort.impl;

import by.pepega.algorithm.algorithms.sort.SortAlgorithm;
import by.pepega.algorithm.algorithms.sort.SortDirection;
import by.pepega.algorithm.structures.Array;

@SuppressWarnings("Duplicates")
public class MergeSort<T extends Comparable<T>> implements SortAlgorithm<T> {

    @Override
    public String getName() {
        return "Merge sort";
    }


    @Override
    public Array<T> sort(Array<T> array, SortDirection sortDirection) {
        return sort(array);
    }



    public static void main(String[] args) {
        Array<Integer> first = new Array<>(new Integer[]{2});
        Array<Integer> second = new Array<>(new Integer[]{1});

        System.out.println(mergeSortedArrays(first, second));
    }

    private static <T extends Comparable<T>> Array<T> mergeSortedArrays(Array<T> first, Array<T> second) {
        Array<T> result = new Array<>(first.size() + second.size());

        for (int i = 0, j = 0, k = 0; i < first.size() && j < second.size(); k++) {
            if (first.get(i).compareTo(second.get(j)) < 0) {
                result.set(k, first.get(i));
                i++;
                if (i == first.size()) {
                    while (j < second.size()) {
                        k++;
                        result.set(k, second.get(j));
                        j++;
                    }
                    return result;
                }
            } else {
                result.set(k, second.get(j));
                j++;
                if (j == second.size()) {
                    while (i < first.size()) {
                        k++;
                        result.set(k, first.get(i));
                        i++;
                    }
                    return result;
                }
            }
        }

//        Works the same
//        int k = 0, i = 0, j = 0;
//
//        while (k < first.size() + second.size()) {
//
//            if (i < first.size() && j < second.size()) {
//                if (first.get(i).compareTo(second.get(j)) < 0) {
//                    result.set(k, first.get(i));
//                    i++;
//                } else {
//                    result.set(k, second.get(j));
//                    j++;
//                }
//                k++;
//            } else if (i < first.size()) {
//                while (i < first.size()) {
//                    result.set(k, first.get(i));
//                    k++;
//                    i++;
//                }
//            } else {
//                while (j < second.size()) {
//                    result.set(k, second.get(j));
//                    k++;
//                    j++;
//                }
//            }
//        }

        return result;
    }

}
