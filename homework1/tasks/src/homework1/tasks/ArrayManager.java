package homework1.tasks;

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
}

