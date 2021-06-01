package homework1.tasks;

public class Task7BubbleSort {
    public static void main(String[] args) {
        int[] array = ArrayManager.init();
        int tmp;
        boolean newIteration = true;

        while (newIteration) {
            newIteration = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    tmp = array[i];
                    array[i] = array[i-1];
                    array[i-1] = tmp;
                    newIteration = true;
                }
            }
        }

        ArrayManager.output(array);
    }
}
