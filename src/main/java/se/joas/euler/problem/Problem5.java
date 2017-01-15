package se.joas.euler.problem;

import java.math.BigInteger;

public final class Problem5 {

    /**
     * Gets the smallest number that is a multiple of all integers up to number.
     * 
     * @param number
     *            All number up to this number should be a multiple
     * @return The smallest number that is a multiple of all integers up to
     *         number.
     */
    public static long getSmallestMultiple(long number) {

        if (number < 1) {
            throw new IllegalArgumentException();
        }

        if (number == 1) {
            return 1;
        }

        long smallestMultiple = 2;
        for (long counter = 2L; counter <= number; counter++) {
            if (new BigInteger(new Long(counter).toString()).isProbablePrime(1000)) {
                smallestMultiple *= counter;
                long prime = counter;
                while (prime * prime <= number) {
                    smallestMultiple *= counter;
                    prime *= prime;
                }
            }
        }
        return smallestMultiple;
    }

}
