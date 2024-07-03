package org.assignment.assignmentmaven.operations;

import java.util.List;
import java.util.stream.Collectors;

public class StreamOperations {
    public static List<Integer> squareOfEach(List<Integer> numbers) {
        return numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
    }

    public static List<Integer> squareOfEven(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .collect(Collectors.toList());
    }
}
