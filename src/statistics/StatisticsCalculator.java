package statistics;

import java.util.List;

public class StatisticsCalculator {

    public double sum(List<Double> values){
        return values.stream()
            .mapToDouble(Double::doubleValue)
            .sum();
    }

    public double arithmeticMean(List<Double> values) {
        if (values.isEmpty())
            throw new IllegalArgumentException("The list cannot be empty.");

        return sum(values) / values.size();
    }

    public double geometricMean(List<Double> values) {
        if (values.isEmpty())
            throw new IllegalArgumentException("The list cannot be empty.");
        
        if (values.stream().anyMatch(v -> v <= 0))
            throw new IllegalArgumentException("Values must be positive for geometric mean.");

        double product = values.stream()
            .mapToDouble(Double::doubleValue)
            .reduce(1.0, (a, b) -> a * b);
        
        return Math.pow(product, 1.0 / values.size());
    }

    public double variance(List<Double> values) {
        double mean = arithmeticMean(values);

        return values.stream()
            .mapToDouble(v -> (v - mean) * (v - mean))
            .sum() / (values.size() - 1);
    }

    public double standardDeviation(List<Double> values) {        
        return Math.sqrt(variance(values));
    }

    public double range(List<Double> values) {
        if (values == null || values.isEmpty()) 
            return 0;
        
        double min = values.getFirst();
        double max = values.getLast();

        for (double i : values) {
            if (i > max) max = i;
            if (i < min) min = i;
        }

        return max - min;
    }
}
