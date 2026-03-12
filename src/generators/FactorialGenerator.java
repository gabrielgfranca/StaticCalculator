package generators;

import java.util.ArrayList;
import java.util.List;


public class FactorialGenerator extends AbstractNumberGenerator {
    
    @Override
    public List<Integer> generate(int n) {
        validateInput(n);
        List<Integer> factorials = new ArrayList<>();
        
        int factorial = 1;
        for (int i = 0; i < n; i++) {
            factorial *= i;
            factorials.add(factorial);
        }
        
        return factorials;
    }
    
}
