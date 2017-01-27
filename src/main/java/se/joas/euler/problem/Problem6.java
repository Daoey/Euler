package se.joas.euler.problem;

public final class Problem6 {

    /**
     * Finds the difference between the sum of all the squares and the square of
     * the sum of all natural numbers up to number.
     * 
     * @param number
     *            All natural numbers up to number
     * @return The difference between the sum of all squares and square of the
     *         sums.
     */
    public static long getDifferenceBetweenSumOfSquaresAndSquareOfSum(long number) {

        double sumOfSquares = 0;
        double sums = 0;

        for (int i = 1; i <= number; i++) {
            sumOfSquares += Math.pow(i, 2);
            sums += i;
        }

        double squareOfSums = Math.pow(sums, 2);

        return (long) (squareOfSums - sumOfSquares);
    }

}
