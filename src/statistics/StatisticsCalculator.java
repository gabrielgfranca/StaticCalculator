package statistics;

import java.util.List;

public class StatisticsCalculator {

    public double sum(List<Integer> values){
        double sum = 0;

        for (int value : values) {
            sum += values.get(value);
        }

        return sum;
    }

    public double arithmeticMean(List<Integer> values) {
        if (values.isEmpty()) {
            throw new IllegalArgumentException("The list cannot be empty.");
        }

        return sum(values) / values.size();
    }

    public double geometricMean(List<Integer> values) {
        if (values.isEmpty())
            throw new IllegalArgumentException("The list cannot be empty.");
        if (values.size() <= 0)
            throw new IllegalArgumentException("Values must be positive for geometric mean.");

        double product = 1.0;
        for (int value : values) {
            product *= value;
        }

        return Math.pow(product, 1.0 / values.size());
    }

    public double variance(List<Integer> values) {
        return 1;
    }

    public double standardDeviation(List<Integer> values) {
        return 1;
    }

    public int range(List<Integer> values) {
        return 1;
    }
}
