package com.General;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MatrixRotationJava8 {
    public static void main(String[] args) {
        int[][] originalMatrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
//awsravi
        int[][] rotatedMatrix = rotateMatrixClockwise(originalMatrix);

        System.out.println("Original Matrix:");
        displayMatrix(originalMatrix);

        System.out.println("Rotated Matrix (90 degrees clockwise):");
        displayMatrix(rotatedMatrix);
    }

    public static int[][] rotateMatrixClockwise(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        return IntStream.range(0, columns)
            .mapToObj(col ->
                IntStream.range(0, rows)
                    .mapToObj(row -> matrix[rows - row - 1][col])
                    .mapToInt(Integer::intValue)
                    .toArray()
            )
            .toArray(int[][]::new);
    }

    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            String rowStr = Arrays.stream(row)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(" "));
            System.out.println(rowStr);
        }
    }
}
