package ir.ac.kntu;

import java.util.Random;

/**
 * write something to describe this class
 * @author [put your name here]
 */
public final class RandomHelper {
    //You don't need to document fields
    private static final Random RANDOM_GENERATOR = new Random(300);
    //You don't need to document non public methods
    private RandomHelper() {

    }
    //TODO: Write javadoc
    public static double nextDouble() {
        return RANDOM_GENERATOR.nextDouble();
    }
    //TODO: Write javadoc
    public static boolean nextBoolean() {
        return RANDOM_GENERATOR.nextBoolean();
    }
    //TODO: Write javadoc
    public static int nextInt() {
        return RANDOM_GENERATOR.nextInt();
    }
    //TODO: Write javadoc
    public static int nextInt(int bound) {
        return RANDOM_GENERATOR.nextInt(bound);
    }
}