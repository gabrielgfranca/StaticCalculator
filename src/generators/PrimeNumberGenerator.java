package generators;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberGenerator extends AbstractNumberGenerator {
    
    @Override
    public List<Integer> generate(int n) {
        validateInput(n);
        List<Integer> primes = new ArrayList<>();
        
        int number = 2;
        while (primes.size() < n) {
            if (isPrime(number))
                primes.add(number);
            
            number++;
        }
        
        return primes;
    }

    private boolean isPrime(int num) {
        if (num <= 1) 
            return false;
        
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) 
                return false;
        }
        return true;
    }
}
