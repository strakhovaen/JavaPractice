package task3;

import java.util.Scanner;

public class Matrix {
    int[][] matrix;
    int rows;
    int columns;

    public Matrix() {

    }

    public Matrix(int[][] matrix, int rows, int columns) {
        this.matrix = matrix;
        this.rows = rows;
        this.columns = columns;
    }


    public int[][] initiateMatrix (int numberRows, int numberColumns) {
        int[][] array = new int[numberRows][numberColumns];
        System.out.println("Введите элементы матрицы размером " + numberRows + "x" + numberColumns + ":");
        Scanner in = new Scanner(System.in);
        for (int i=0; i < array.length; i++) {
            for (int j=0; j < array[i].length; j++) {
                array[i][j] = in.nextInt();
            }
        }
        return array;
    }

    public void outputMatrix() {
        if (this.matrix != null) {
            for (int[] row : this.matrix) {
                for (int element : row) {
                    System.out.print(element + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public int[][] multiply(int number) {
        int[][] array = this.matrix;
        if (array != null) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = array[i][j] * number;
                }
            }
        }
        return array;
    }

    public int[][] sum (int[][] array2) {
        int[][] array1 = this.matrix;
        if ((array1 != null) & (array2 != null)) {
            for (int i = 0; i < array1.length; i++) {
                for (int j = 0; j < array1[i].length; j++) {
                    array1[i][j] = array1[i][j] + array2[i][j];
                }
            }
        }
        return array1;
    }

    public static void main(String[] args) {
        Matrix matrix1 = new Matrix();
        matrix1.rows = 2;
        matrix1.columns = 3;
        matrix1.matrix = matrix1.initiateMatrix(matrix1.rows,matrix1.columns);

        int[][] array2 = {{5,6,7},{8,9,10}};
        Matrix matrix2 = new Matrix(array2,2,3);

        int[][] array3 = {{-1,-2,-3},{-4,-5,-6}};
        Matrix matrix3 = new Matrix(array3,2,3);

        matrix1.matrix = matrix1.multiply(10);

        matrix2.matrix = matrix2.sum(matrix3.matrix);

        matrix1.outputMatrix();
        matrix2.outputMatrix();
        matrix3.outputMatrix();
    }

}
