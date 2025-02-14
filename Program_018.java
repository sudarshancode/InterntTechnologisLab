/*
   Write java program for the following matrix operations: (a) Addition of two matrix operations
   (b) Transpose of a matrix input the elements of matrices from user
*/
import java.util.Scanner;

class Program_018 {
    // Method to add two matrices
    static int[][] addMatrices(int[][] A, int[][] B, int rows, int cols) {
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }
        return result;
    }

    // Method to transpose a matrix
    static int[][] transposeMatrix(int[][] A, int rows, int cols) {
        int[][] result = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = A[i][j];
            }
        }
        return result;
    }

    // Method to display a matrix
    static void displayMatrix(int[][] matrix, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        int[][] matrixA = new int[rows][cols];
        int[][] matrixB = new int[rows][cols];

        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrixA[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrixB[i][j] = scanner.nextInt();
            }
        }

        int[][] sumMatrix = addMatrices(matrixA, matrixB, rows, cols);
        int[][] transposeMatrixA = transposeMatrix(matrixA, rows, cols);

        System.out.println("Sum of the matrices:");
        displayMatrix(sumMatrix, rows, cols);

        System.out.println("Transpose of first matrix:");
        displayMatrix(transposeMatrixA, cols, rows);

        scanner.close();
    }
}

