package se.joas.euler.problem;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestProblem1 {

    @Test
    public void sumOfAllMultiplesOfThreeOrFiveBelow1000ShouldBe233168() {
        assertEquals(233168, Problem1.getSumOfAllMultiplesOfThreeOrFive(1000));
    }

    @Test
    public void sumOfAllMultiplesOfThreeOrFiveBelowTenShouldBeTwentythree() {
        assertEquals(23, Problem1.getSumOfAllMultiplesOfThreeOrFive(10));
    }

    @Test
    public void sumOfAllMultiplesOfThreeOrFiveBelowFiveShouldBeThree() {
        assertEquals(3, Problem1.getSumOfAllMultiplesOfThreeOrFive(5));
    }

    @Test
    public void sumOfAllMultiplesOfThreeOrFiveBelowZeroShouldBeZero() {
        assertEquals(0, Problem1.getSumOfAllMultiplesOfThreeOrFive(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void sumOfAllMultiplesOfThreeOrFiveBelowNegativeNumberShouldThrowIllegalArgumentException() {
        Problem1.getSumOfAllMultiplesOfThreeOrFive(-1);
    }

    @Test(expected = ArithmeticException.class)
    public void sumOfAllMultiplesOfThreeOrFiveBelowHugeNumberShouldThrowArithmeticException() {
        Problem1.getSumOfAllMultiplesOfThreeOrFive(10000000);
    }

}
