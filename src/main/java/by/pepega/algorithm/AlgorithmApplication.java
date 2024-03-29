package by.pepega.algorithm;

import by.pepega.algorithm.algorithms.sort.SortAlgorithm;
import by.pepega.algorithm.algorithms.sort.SortDirection;
import by.pepega.algorithm.algorithms.sort.impl.BubbleSort;
import by.pepega.algorithm.algorithms.sort.impl.MergeSort;
import by.pepega.algorithm.structures.Array;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AlgorithmApplication {

    public static void main(String[] args) {
//        SpringApplication.run(AlgorithmApplication.class, args);

        Array<Integer> array = new Array<>(new Integer[]{
                1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8
        });

        Array<Integer> unsortedArray = new Array<>(new Integer[]{
                6, 5, 3, 1, 8, 7, 2, 4, 9
        });

        SortAlgorithm<Integer> sort = new MergeSort<>();
        System.out.println(sort.sort(unsortedArray));
//        System.out.println(sort.sort(unsortedArray, SortDirection.ASC));
//        System.out.println(sort.sort(unsortedArray, SortDirection.DESC));

    }

}
