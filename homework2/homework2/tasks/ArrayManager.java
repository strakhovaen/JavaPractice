package homework2.tasks;

import java.util.Scanner;

public class ArrayManager {
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
    }

    public static void deleting(int[] array) {

    }

}
