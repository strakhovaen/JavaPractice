//06. Сортировка массива вставками

package homework1.tasks;

public class Task6InsertionSort {
    public static void main(String[] args) {
        int[] array = ArrayManager.init();
        int tmp;

        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0 && array[j-1] > array[j]; j--) {
                tmp = array[j];
                array[j] = array[j - 1];
                array[j - 1] = tmp;
            }
        }

        ArrayManager.output(array);
    }

}
