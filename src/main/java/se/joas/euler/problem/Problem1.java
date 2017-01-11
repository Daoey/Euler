package se.joas.euler.problem;

/*
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. 
The sum of these multiples is 23.
Find the sum of all the multiples of 3 or 5 below 1000.
 */

public final class Problem1 {

    /**
     * Finds the sum of all multiples of three or five up to given limit.
     * 
     * @param limit
     *            The limit of when to stop looking for multiples
     * @return The sum of all multiples
     */
    public static int getSumOfAllMultiplesOfThreeOrFive(int limit) {

        if (limit < 0) {
            throw new IllegalArgumentException("The limit must be a positive number");
        }

        int sum = 0;
        for (int i = 0; i < limit; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum = Math.addExact(sum, i);
            }
        }
        return sum;
    }
}
