package by.pepega.algorithm.algorithms.search;

import java.util.function.Function;

import by.pepega.algorithm.algorithms.Algorithm;

public class TernarySearch implements Algorithm {

    @Override
    public String getName() {
        return "Ternary search";
    }


    public double searchMin(Function<Double, Double> func, double left, double right, double accuracy) {
        if (right - left < accuracy) {
            return (left + right) / 2;
        }

        double midLeft = left + (right - left) / 3;
        double midRight = left + 2 * (right - left) / 3;

        return func.apply(midLeft) <= func.apply(midRight)
            ? searchMin(func, left, midRight, accuracy)
            : searchMin(func, midLeft, right, accuracy);
    }

    public double searchMax(Function<Double, Double> func, double left, double right, double accuracy) {
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
