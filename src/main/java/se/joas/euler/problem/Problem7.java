package se.joas.euler.problem;


import se.joas.euler.PrimeGenerator;

public final class Problem7 {

    /**Finds the prime at the specified prime index.
     *
     * @param primeIndex
     *  The desired prime index
     *
     * @return
     *  The prime at the prime index
     */

    public static int findPrime(int primeIndex) {

        PrimeGenerator primeGenerator = new PrimeGenerator(Double.valueOf(primeIndex * 1000).intValue());

        return primeGenerator.getPrimes().get(primeIndex - 1);
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
