package statistics;

import java.util.List;

public class StatisticsCalculator {

    public double sum(List<Double> values){
        
        double sum = 0;

        for (double i : values)
            sum += values.indexOf(i);

        return sum;
    }

    public double arithmeticMean(List<Double> values) {
        
        if (values.isEmpty())
            throw new IllegalArgumentException("The list cannot be empty.");

        return sum(values) / values.size();
    }

    public double geometricMean(List<Double> values) {
        
        if (values.isEmpty())
            throw new IllegalArgumentException("The list cannot be empty.");

        if (values.size() <= 0)
            throw new IllegalArgumentException("Values must be positive for geometric mean.");

        double product = 1.0;
        for (double i : values)
            product *= i;

        return Math.pow(product, 1.0 / values.size());
    }

    public double variance(List<Double> values) {
        
        double mean = arithmeticMean(values);
        
        double variance  = 0;

        for (double i : values) {
            variance += (i - mean) * (i - mean);
        }
        
        variance /= (values.size() - 1);

        return variance;
    }

    public double standardDeviation(List<Double> values) {
        return 1;
    }

    public int range(List<Double> values) {
        return 1;
    }
}
