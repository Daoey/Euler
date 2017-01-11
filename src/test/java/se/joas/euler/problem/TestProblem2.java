package se.joas.euler.problem;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestProblem2 {

    @Test
    public void fibonacciEvenSumLimit4000000ShouldBe4613732() {
        assertEquals(4613732, Problem2.findSumOfEvenTermsFibonacci(4000000));
    }

    @Test
    public void fibonacciEvenSumLimit89ShouldBe44() {
        assertEquals(44, Problem2.findSumOfEvenTermsFibonacci(89));
    }

    @Test
    public void fibonacciEvenSumLimit1ShouldBe0() {
        assertEquals(0, Problem2.findSumOfEvenTermsFibonacci(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void fibonacciEvenSumNegativeNumberShouldThrowIllegalArgumentException() {
        Problem2.findSumOfEvenTermsFibonacci(-1);
    }

}
