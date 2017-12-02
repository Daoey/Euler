package se.joas.euler;

import java.util.ArrayList;
import java.util.List;

public final class PrimeGenerator {

    private List<Integer> primes = new ArrayList<>();

    public PrimeGenerator(int limit) {
        generatePrimes(limit);
    }

    private void generatePrimes(int limit) {

        boolean[] isPrime = new boolean[limit + 1];
        for (int i = 2; i <= limit; i++) {
            isPrime[i] = true;
        }

        for (int factor = 2; factor * factor <= limit; factor++) {
            if (isPrime[factor]) {
                for (int j = factor; factor * j <= limit; j++) {
                    isPrime[factor * j] = false;
                }
            }
        }

        for (int i = 2; i <= limit; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }
    }

    public List<Integer> getPrimes() {
        return primes;
    }
}
