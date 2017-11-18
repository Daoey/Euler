package se.joas.euler;

import se.joas.euler.problem.*;

import java.time.Duration;
import java.time.Instant;

public class Main {

    /**Runs the questions.
     * 
     * @param args arguments
     */
    public static void main(String[] args) {
        
        Instant start = Instant.now();
        int answerProblem1 = Problem1.getSumOfAllMultiplesOfThreeOrFive(1000);
        Instant end = Instant.now();
        System.out.println("Solution problem 1: " + answerProblem1);
        System.out.println("Time: " +  Duration.between(start, end));
        
        long answerProblem2 = Problem2.findSumOfEvenTermsFibonacci(4000000);
        System.out.println("Solution problem 2: " + answerProblem2);
        
        long answerProblem3 = Problem3.getLargestPrimeFactor(600851475143L);
        System.out.println("Solution problem 3: " + answerProblem3);
        
        long answerProblem4 = Problem4.getLargestPalindrome(999);
        System.out.println("Solution problem 4: " + answerProblem4);
        
        long answerProblem5 = Problem5.getSmallestMultiple(20);
        System.out.println("Solution problem 5: " + answerProblem5);
    }

}
