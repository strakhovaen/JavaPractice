//05. Поменять местами минимум и максимум в введённом массиве

package homework1.tasks;

public class Task5MinAndMaxSwitchPlaces {
    public static void main(String [] args) {
        int[] array = ArrayManager.init();

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

        array[minIndex] = max;
        array[maxIndex] = min;

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
