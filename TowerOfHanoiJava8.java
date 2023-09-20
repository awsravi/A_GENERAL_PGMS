package com.General;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TowerOfHanoiJava8 {
    public static void main(String[] args) {
        int numDisks = 3; // Change this to the desired number of disks
        List<String> steps = solveHanoi(numDisks, 'A', 'C', 'B');
        steps.forEach(System.out::println);
    }
//awsravi
    public static List<String> solveHanoi(int numDisks, char source, char destination, char auxiliary) {
        if (numDisks == 1) {
            return Stream.of("Move disk 1 from " + source + " to " + destination).collect(Collectors.toList());
        }

        List<String> firstStep = solveHanoi(numDisks - 1, source, auxiliary, destination);
        List<String> middleStep = Stream.of("Move disk " + numDisks + " from " + source + " to " + destination).collect(Collectors.toList());
        List<String> lastStep = solveHanoi(numDisks - 1, auxiliary, destination, source);

        return Stream.concat(Stream.concat(firstStep.stream(), middleStep.stream()), lastStep.stream())
                .collect(Collectors.toList());
    }
}
