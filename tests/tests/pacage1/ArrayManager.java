package tests.pacage1;

import java.util.Scanner;

public class ArrayManager {
    public static void main(String[] args) {

    }


    public static int[] init() {
        Scanner in = new Scanner(System.in);
        System.out.println("How many elements in array?");
        int n = in.nextInt();
        int[] array = new int[n];
        System.out.println("Input array elements: ");
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }

        in.close();

        return array;
    }


    public static void swap(int[] array, int index1, int index2) {
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }


    public static void output(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }


    public static int[] delete(int[] array, int index) {
        int[] arrayNew = new int[array.length - 1];
        int j = 0;
        int i = 0;

        while (i < array.length) {
            if (i == index) i++;
            arrayNew[j] = array[i];
            i++;
            j++;
        }

        System.out.print("An element is deleted: ");
        output(arrayNew);

        return arrayNew;
    }


    public static void insertMiddle(int[] array, int number) {
        int[] arrayNew = new int[array.length + 1];
        int index = arrayNew.length / 2;
        int j = 0;
        int i = 0;

        while (j < arrayNew.length) {
            if (j == index) {
                arrayNew[j] = number;
            } else {
                arrayNew[j] = array[i];
                i++;
            }
            j++;
        }

        System.out.print("An element is inserted in the middle: ");
        output(arrayNew);

    }


    public static void insertEnd(int[] array, int number) {
        int[] arrayNew = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            arrayNew[i] = array[i];
        }
        arrayNew[array.length] = number;
        System.out.print("An element is inserted to the end: ");
        output(arrayNew);
        System.out.println();
    }


    public static void sortBubble(int[] array) {
        boolean newIteration = true;

        while (newIteration) {
            newIteration = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    ArrayManager.swap(array,i-1, i);
                    newIteration = true;
                }
            }
        }

        System.out.print("Sorted array (Bubble Sorting): ");
        output(array);
    }


    public static void sortInsertion(int[] array) {
        int tmp;

        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0 && array[j-1] > array[j]; j--) {
                tmp = array[j];
                array[j] = array[j - 1];
                array[j - 1] = tmp;
            }
        }

        System.out.print("Sorted array (Insertion Sorting): ");
        output(array);
    }


    public static void reverseArray (int[] array) {
        for (int i = 0; i <= array.length/2; i++) {
            ArrayManager.swap(array,i,array.length-i-1);
        }

        System.out.print("Reversed array: ");
        output(array);
    }


    public static void minAndMaxSwitch(int[] array) {
        int min = array[0];
        int minIndex = 0;
        int max = array[0];
        int maxIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }

            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
        }

        swap(array, minIndex, maxIndex);

        System.out.print("Min and Max switched array: ");
        output(array);
    }

}

