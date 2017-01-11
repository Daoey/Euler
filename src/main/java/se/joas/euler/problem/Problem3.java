package se.joas.euler.problem;

public final class Problem3 {

    /**
     * Get the largest prime factor of a number.
     * 
     * @param number
     *            The number w
     * @return The largest prime factor of the number or 0 if the number is less
     *         than or equal to 1
     */
    public static long getLargstPrimeFactor(long number) {

        if (number <= 1) {
            throw new IllegalArgumentException("Number must be larger than 1");
        }

        long counter = 2;

        while (counter < number) {
            if (number % counter == 0) {
                number /= counter;
                continue;
            }
            counter++;
        }

        return number;
    }
}
