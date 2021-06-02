//09. Сортировка пузырьком, но с использованием функций

package homework1.tasks;

public class Task9BubbleSortFunction {
    public static void main(String[] args) {
        int[] array = ArrayManager.init();
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

        ArrayManager.output(array);
    }
}
