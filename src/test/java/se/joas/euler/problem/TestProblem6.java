package se.joas.euler.problem;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestProblem6 {

    @Test
    public void differenceFirst10ShouldBe2640() {
        assertEquals(2640, Problem6.getDifferenceBetweenSumOfSquaresAndSquareOfSum(10));
    }
    
    @Test
    public void differenceFirst100ShouldBe25164150() {
        assertEquals(25164150, Problem6.getDifferenceBetweenSumOfSquaresAndSquareOfSum(100));
    }
}
