package se.joas.euler;

import java.time.Duration;
import java.time.Instant;

import se.joas.euler.problem.Problem1;
import se.joas.euler.problem.Problem2;

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

        
        
    }

}
