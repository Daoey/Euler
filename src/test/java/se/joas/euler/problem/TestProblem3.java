package se.joas.euler.problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestProblem3 {

    @Test
    public void largestPrimeFactorOf4ShouldBe2() {
        assertEquals(2, Problem3.getLargestPrimeFactor(4));
    }
    
    @Test
    public void largestPrimeFactorOf17ShouldBe17() {
        assertEquals(17, Problem3.getLargestPrimeFactor(17));
    }
    
    @Test
    public void largestPrimeFactorOf6857ShouldBe6857() {
        assertEquals(6857, Problem3.getLargestPrimeFactor(6857));
 
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void largestPrimeFactorOfNegativeShouldThrowIllegalArgument() {
        Problem3.getLargestPrimeFactor(-10);

    }

}
