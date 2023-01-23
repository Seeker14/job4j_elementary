package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SwitchArrayTest {
    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSwap3To7() {
        int[] input = {2, 4, 6, 16, 10, 12, 14, 8, 18, 20};
        int source = 3;
        int dest = 7;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSwap4To5() {
        int[] input = {23, 14, 5, 99, 3, 21, 45};
        int source = 4;
        int dest = 5;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {23, 14, 5, 99, 21, 3, 45};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSwap3To6() {
        int[] input = {11, 22, 33, 77, 55, 66, 44, 88, 99, 111};
        int source = 3;
        int dest = 6;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {11, 22, 33, 44, 55, 66, 77, 88, 99, 111};
        assertThat(result).containsExactly(expected);
    }
}