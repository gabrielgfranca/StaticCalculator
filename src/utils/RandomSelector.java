package utils;

import java.util.List;
import java.util.Random;

public class RandomSelector {

    public int random(List<Integer> values) {
        Random rand = new Random();
        return values.get(rand.nextInt(values.size()));
    }

}
