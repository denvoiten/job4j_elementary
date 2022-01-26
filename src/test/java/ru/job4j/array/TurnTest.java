package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class TurnTest {
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        int[] input = new int[]{4, 1, 6, 2, 3, 5};
        int[] result = Turn.back(input);
        int[] expect = new int[]{5, 3, 2, 6, 1, 4};
        Assert.assertArrayEquals(expect, result);
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        int[] input = new int[]{8, 12, 1, 88, 63, 11, 18};
        int[] result = Turn.back(input);
        int[] expect = new int[]{18, 11, 63, 88, 1, 12, 8};
        Assert.assertArrayEquals(expect, result);
    }

}