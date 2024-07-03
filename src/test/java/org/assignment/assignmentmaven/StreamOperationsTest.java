package org.assignment.assignmentmaven;

import org.assignment.assignmentmaven.operations.StreamOperations;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class StreamOperationsTest {
    @Test
    public void testSquareOfEach() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        List<Integer> expected = Arrays.asList(1, 4, 9, 16);
        assertEquals(expected, StreamOperations.squareOfEach(numbers));
    }

    @Test
    public void testSquareOfEven() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        List<Integer> expected = Arrays.asList(4, 16);
        assertEquals(expected, StreamOperations.squareOfEven(numbers));
    }
}
