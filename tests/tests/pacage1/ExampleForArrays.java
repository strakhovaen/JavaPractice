package tests.pacage1;

public class ExampleForArrays {
    public static void main(String[] args) {

        int[] array = ArrayManager.init();

        ArrayManager.output(array);

        ArrayManager.delete(array,0);

        ArrayManager.insertMiddle(array,13);

        ArrayManager.insertEnd(array, 99);

        ArrayManager.minAndMaxSwitch(array);

        ArrayManager.reverseArray(array);

        ArrayManager.sortBubble(array);

        ArrayManager.sortInsertion(array);

    }
}
