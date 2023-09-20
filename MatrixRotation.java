package com.General;


public class MatrixRotation {
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
        int[][] rotatedMatrix = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                rotatedMatrix[j][rows - 1 - i] = matrix[i][j];
            }
        }

        return rotatedMatrix;
    }

    public static void displayMatrix(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
