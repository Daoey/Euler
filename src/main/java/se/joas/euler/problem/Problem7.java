package se.joas.euler.problem;


public final class Problem7 {

    /**Finds the prime at the specified prime index.
     *
     * @param primeIndex
     *  The desired prime index
     *
     * @return
     *  The prime at the prime index
     */
    public static long findPrime(int primeIndex) {

        long number = 2;
        int primeCounter = 0;
        while (true) {
            if(isPrime(number)) {
                primeCounter++;
                if(primeCounter == primeIndex) {
                    return number;
                }
            }
            number++;
        }
    }

    private static boolean isPrime(long number) {
        for(long i = 2; i<=number/3; i++) {
            if(number%i == 0)
                return false;
        }
        if(number == 2)
            return true;
        return true;
    }


}
