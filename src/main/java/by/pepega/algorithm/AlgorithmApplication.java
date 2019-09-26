package by.pepega.algorithm;

import by.pepega.algorithm.algorithms.search.BinarySearch;
import by.pepega.algorithm.algorithms.search.LinearSearch;
import by.pepega.algorithm.algorithms.search.SearchAlgorithm;
import by.pepega.algorithm.structures.Array;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AlgorithmApplication {

    public static void main(String[] args) {
//		SpringApplication.run(AlgorithmApplication.class, args);

        Array<Integer> array = new Array<>(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9});

        SearchAlgorithm<Integer> linearSearch = new BinarySearch<>();

        System.out.println("1 = " + linearSearch.search(array, 1));
        System.out.println("2 = " + linearSearch.search(array, 2));
        System.out.println("3 = " + linearSearch.search(array, 3));
        System.out.println("4 = " + linearSearch.search(array, 4));
        System.out.println("5 = " + linearSearch.search(array, 5));
        System.out.println("6 = " + linearSearch.search(array, 6));
        System.out.println("7 = " + linearSearch.search(array, 7));
        System.out.println("8 = " + linearSearch.search(array, 8));
        System.out.println("9 = " + linearSearch.search(array, 9));

    }

}
