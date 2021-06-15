package tests;

import org.junit.Assert;
import org.junit.Test;
import utils.ArrayManager;

public class ArrayManagerTest {
    ArrayManager arrayManager = new ArrayManager();

    public int[] createArray1() {
        int[] array = {1,2,3,4,5};
        return array;
    }

    public int[] createArray2() {
        int[] array = {13,4,0,-7,1,1};
        return array;
    }

    public int[] createArray3() {
        int[] array = {100,1000,-99,999};
        return array;
    }

    @Test
    public void swap() {
        int[] actual = createArray1();
        ArrayManager.output(actual);

        System.out.println("Let's swap!");
        ArrayManager.swap(actual,0,4);
        ArrayManager.swap(actual,0,1);
        ArrayManager.output(actual);

        int[] expected = {2,5,3,4,1};
        Assert.assertArrayEquals(actual,expected);
    }


    @Test
    public void delete() {
        int[] actual = createArray2();
        ArrayManager.output(actual);

        System.out.println("Let's delete!");
        actual = ArrayManager.delete(actual,2);
        actual = ArrayManager.delete(actual,3);
        ArrayManager.output(actual);

        int[] expected = {13,4,-7,1};
        Assert.assertArrayEquals(actual,expected);
    }


    @Test
    public void insertMiddle() {
        int[] actual = createArray3();
        ArrayManager.output(actual);

        System.out.println("Let's insert an element in the middle!");
        actual = ArrayManager.insertMiddle(actual,77);
        actual = ArrayManager.insertMiddle(actual,0);
        actual = ArrayManager.insertMiddle(actual,1);
        ArrayManager.output(actual);

        int[] expected = {100,1000,77,1,0,-99,999};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void insertEnd() {
        int[] actual = createArray1();
        ArrayManager.output(actual);

        System.out.println("Let's insert the elements in the end!");
        actual = ArrayManager.insertEnd(actual,6);
        actual = ArrayManager.insertEnd(actual,7);
        actual = ArrayManager.insertEnd(actual,8);
        actual = ArrayManager.insertEnd(actual,9);
        actual = ArrayManager.insertEnd(actual,10);
        ArrayManager.output(actual);

        int[] expected = {1,2,3,4,5,6,7,8,9,10};
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void sortBubble() {
        int[] actual1 = createArray1();
        ArrayManager.output(actual1);

        System.out.println("Sorted array (Bubble):");
        ArrayManager.sortBubble(actual1);
        ArrayManager.output(actual1);

        int[] actual2 = createArray2();
        ArrayManager.output(actual2);

        System.out.println("Sorted array (Bubble):");
        ArrayManager.sortBubble(actual2);
        ArrayManager.output(actual2);

        int[] expected1 = {1,2,3,4,5};
        int[] expected2 = {-7,0,1,1,4,13};
        Assert.assertArrayEquals(actual1,expected1);
        Assert.assertArrayEquals(actual2,expected2);
    }


    @Test
    public void sortInsertion() {
        int[] actual = createArray3();
        ArrayManager.output(actual);

        System.out.println("Sorted array (Insertion):");
        ArrayManager.sortInsertion(actual);
        ArrayManager.output(actual);

        int[] expected = {-99,100,999,1000};
        Assert.assertArrayEquals(actual,expected);
    }


    @Test
    public void reverseArray() {
        int[] actual = createArray2();
        ArrayManager.output(actual);

        System.out.println("Sorted array (Insertion):");
        ArrayManager.sortInsertion(actual);
        ArrayManager.output(actual);

        System.out.println("Reversed array:");
        ArrayManager.reverseArray(actual);
        ArrayManager.output(actual);

        int[] expected2 = {13,4,1,1,0,-7};
        Assert.assertArrayEquals(actual,expected2);
    }


    @Test
    public void minAndMaxSwitch() {
        int[] actual1 = createArray2();
        ArrayManager.output(actual1);

        System.out.println("Min and Max switched:");
        ArrayManager.minAndMaxSwitch(actual1);
        ArrayManager.output(actual1);

        int[] actual2 = createArray3();
        ArrayManager.output(actual2);

        System.out.println("Min and Max switched:");
        ArrayManager.minAndMaxSwitch(actual2);
        ArrayManager.output(actual2);

        int[] expected1 = {-7,4,0,13,1,1};
        Assert.assertArrayEquals(actual1,expected1);

        int[] expected2 =  {100,-99,1000,999};
        Assert.assertArrayEquals(actual2,expected2);
    }
}