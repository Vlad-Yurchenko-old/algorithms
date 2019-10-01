package by.pepega.algorithm.algorithms.search.impl;

import by.pepega.algorithm.algorithms.search.ExtremumSearchAlgorithm;

import java.util.function.Function;

public class TernarySearch implements ExtremumSearchAlgorithm<Double> {

    @Override
    public String getName() {
        return "Ternary search";
    }


    @Override
    public Double searchMin(Function<Double, Double> func, Double left, Double right, double accuracy) {
        if (right - left < accuracy) {
            return (left + right) / 2;
        }

        double midLeft = left + (right - left) / 3;
        double midRight = left + 2 * (right - left) / 3;

        return func.apply(midLeft) <= func.apply(midRight)
                ? searchMin(func, left, midRight, accuracy)
                : searchMin(func, midLeft, right, accuracy);
    }


    @Override
    public Double searchMax(Function<Double, Double> func, Double left, Double right, double accuracy) {
        while (right - left >= accuracy) {
            double midLeft = left + (right - left) / 3;
            double midRight = left + 2 * (right - left) / 3;
            if (func.apply(midLeft) > func.apply(midRight)) {
                right = midRight;
            } else {
                left = midLeft;
            }
        }
        return (left + right) / 2;
    }

}
