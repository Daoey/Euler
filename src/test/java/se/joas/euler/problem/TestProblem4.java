package se.joas.euler.problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestProblem4 {

    @Test
    public void largestPalindromeOf99ShouldBe9009() {
        assertEquals(9009, Problem4.getLargestPalindrome(99));
    }

    @Test
    public void largestPalindromeOf999ShouldBe906609() {
        assertEquals(906609, Problem4.getLargestPalindrome(999));
    }

    @Test
    public void largestPalindromeOf1ShouldBe1() {
        assertEquals(1, Problem4.getLargestPalindrome(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void largestPalindromeOfNegativeShouldThrowIllegalArgument() {
        Problem4.getLargestPalindrome(-12);
    }

    @Test(timeout = 100)
    public void speedTestMediumNumber() {
        Problem4.getLargestPalindrome(12345);
    }

    @Test(timeout = 500)
    public void speedTestLargeNumber() {
        Problem4.getLargestPalindrome(123456);
    }
}
