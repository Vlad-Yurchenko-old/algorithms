package by.pepega.algorithm;

import by.pepega.algorithm.structures.Array;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AlgorithmApplication {

    public static void main(String[] args) {
//        SpringApplication.run(AlgorithmApplication.class, args);

        Array<Integer> array = new Array<>(new Integer[]
                {1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8}
        );

    }

}
