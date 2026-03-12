package generators;

public abstract class AbstractNumberGenerator implements NumberGenerator {

    protected void validateInput(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input must be a non-negative integer.");
        }
    }
    
}
