package tests.pacage1;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayManagerTest {

    @Test
    public void init() {
        int[] array = ArrayManager.init();
        ArrayManager.output(array);
    }

    @Test
    public void swap() {
        int[] array = ArrayManager.init();
        ArrayManager.output(array);
    }


    @Test
    public void delete() {
        int[] array = ArrayManager.init();
        ArrayManager.delete(array,0);
    }

    @Test
    public void insertMiddle() {
    }

    @Test
    public void insertEnd() {
    }

    @Test
    public void sortBubble() {
    }

    @Test
    public void sortInsertion() {
    }

    @Test
    public void reverseArray() {
    }

    @Test
    public void minAndMaxSwitch() {
    }
}