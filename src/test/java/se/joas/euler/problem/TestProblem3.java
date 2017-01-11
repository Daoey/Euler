package se.joas.euler.problem;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestProblem3 {

    @Test
    public void largestPrimeFactorOf4ShouldBe2() {
        assertEquals(2, Problem3.getLargstPrimeFactor(4));
    }
    
    @Test
    public void largestPrimeFactorOf17ShouldBe17() {
        assertEquals(17, Problem3.getLargstPrimeFactor(17));
    }
    
    @Test
    public void largestPrimeFactorOf6857ShouldBe6857() {
        assertEquals(6857, Problem3.getLargstPrimeFactor(6857));
 
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void largestPrimeFactorOfNegativeShouldThrowIllegalArgument() {
        Problem3.getLargstPrimeFactor(-10);
    }

}
