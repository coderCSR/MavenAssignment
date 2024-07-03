package org.assignment.assignmentmaven.demo;

import org.assignment.assignmentmaven.operations.StreamOperations;

import java.util.Arrays;
import java.util.List;

public class StreamOperationsApplication {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 21, 35, 4, 51, 69);

        List<Integer> squaredNumbers = StreamOperations.squareOfEach(numbers);
        List<Integer> squaredEvenNumbers = StreamOperations.squareOfEven(numbers);

        System.out.println("Original numbers: " + numbers);
        System.out.println("Squared numbers: " + squaredNumbers);
        System.out.println("Squared even numbers: " + squaredEvenNumbers);
    }
}
