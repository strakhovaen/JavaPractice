package homework1.tasks;

public class Task8ReversedArray {
    public static void main (String[] args) {
        int[] array = ArrayManager.init();
        for (int i = 0; i <= array.length/2; i++) {
            ArrayManager.swap(array,i,array.length-i-1);
        }

        ArrayManager.output(array);
    }
}
