package generators;

import java.util.ArrayList;
import java.util.List;

public class FibonacciGenerator extends AbstractNumberGenerator {
    
    @Override
    public List<Integer> generate(int n) {
        validateInput(n);
        List<Integer> fbSequence = new ArrayList<>();
        int a = 0, b = 1;

        for (int i = 0; i < n; i++) {
            fbSequence.add(a);
            int temp = a;
            a = b;
            b = temp + b;
        }
        
        return fbSequence;
    }
}
