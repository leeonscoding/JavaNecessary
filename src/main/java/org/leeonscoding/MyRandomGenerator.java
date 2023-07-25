package org.leeonscoding;

import java.util.Random;

public class MyRandomGenerator {
    public static void basicRandomExample() {
        Random random = new Random();

        //returns a value either true or false
        System.out.println(random.nextBoolean());

        System.out.println("int example");
        //returns a number between the int range 2^32
        System.out.println(random.nextInt());
        //between 1 and bound-1. bound can't be negative, otherwise IllegalArgumentException
        System.out.println(random.nextInt(10));
        /* Between origin(including) to bound.
        Throws IllegalArgumentException if origin >= bound */
        System.out.println(random.nextInt(200, 210));

        System.out.println("double example");
        //between 0.0 to 1.0
        System.out.println(random.nextDouble());
        //between 0.0 to 0.6
        System.out.println(random.nextDouble(0.6d));
        //between 0.3 to 0.6
        System.out.println(random.nextDouble(0.3d, 0.6d));
    }

    public static void randomSeedExample() {
        Random random1 = new Random();
        random1.setSeed(200);

        //constructor is using internally the setSeed(long) method
        Random random2 = new Random(10);
        Random random3 = new Random(10);

        System.out.println(random1.nextInt());
        //Both prints the same value
        System.out.println(random2.nextInt());
        System.out.println(random3.nextInt());
    }

    //generate a stream of 5 ints between 20 to 30
    public static void generateIntStream() {
        Random random = new Random();
        random.ints(5, 20, 30)
                .forEach(System.out::println);

    }

    public static void main(String[] a) {
        //basicRandomExample();
        //randomSeedExample();
        generateIntStream();
    }
}
