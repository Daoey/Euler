package se.joas.euler.problem;

public final class Problem4 {

    /**
     * Gets the largest palindrome that can be created by a product less than
     * number.
     * 
     * @param number
     *            The max size of the product
     * @return The largest palindrome
     */
    public static long getLargestPalindrome(long number) {

        if (number < 1) {
            throw new IllegalArgumentException("Number has to be larger than 0");
        }

        long product1 = number;
        long product2;

        long largestPalindrome = 0;

        while (true) {
            product2 = product1;
            if (product1 * product2 <= largestPalindrome) {
                break;
            }
            while (product1 * product2 >= largestPalindrome) {
                if (isPalindrome(new Long(product1 * product2).toString())) {
                    if (product1 * product2 > largestPalindrome) {
                        largestPalindrome = product1 * product2;
                    }
                    break;
                }
                product2--;
            }
            product1--;
        }
        return largestPalindrome;
    }

    private static boolean isPalindrome(String number) {
        String numberReversed = new StringBuilder(number).reverse().toString();
        return numberReversed.equals(number);
    }
}
