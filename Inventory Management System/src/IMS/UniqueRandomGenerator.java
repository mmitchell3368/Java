package IMS;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class UniqueRandomGenerator {
    private Set<Integer> generatedNumbers;
    private Random random;

    public UniqueRandomGenerator() {
        generatedNumbers = new HashSet<>();
        random = new Random();
    }

    public int generateUniqueRandom(int min, int max) {
        int randomNumber;
        do {
            randomNumber = random.nextInt(max - min + 1) + min;
        } while (!generatedNumbers.add(randomNumber)); // Continue generating if the number is already in the set
        return randomNumber;
    }

}
