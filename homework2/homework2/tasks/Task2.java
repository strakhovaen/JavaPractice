//02. Вывести разницу между максимальным и минимальным числом из введённых

package homework2.tasks;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int[] array = ArrayManager.init();
        int min = array[0];
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) min = array[i];
            if (array[i] > max) max = array[i];
        }

        int dif = max - min;

        System.out.println(dif);
    }
}
