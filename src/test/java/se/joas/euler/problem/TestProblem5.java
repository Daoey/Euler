package se.joas.euler.problem;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestProblem5 {

    @Test
    public void smallestMultipleOf20ShouldBe232792560() {
        assertEquals(232792560, Problem5.getSmallestMultiple(20));
    }
    
    @Test
    public void smallestMultipleOf1ShouldBe1() {
        assertEquals(1, Problem5.getSmallestMultiple(1));
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void smallestMultipleOfNegativeShouldThrowIllegalArgument() {
        assertEquals(-2, Problem5.getSmallestMultiple(-2));
    }
    
    @Test
    public void smallestMultipleOf10ShouldBe2520() {
        assertEquals(2520 , Problem5.getSmallestMultiple(10));
    }
}
