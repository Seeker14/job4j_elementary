package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortArrayWith3Elements() {
        int[] data = new int[] {12, 1, 3};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 3, 12};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortArrayWith5Elements() {
        int[] data = new int[] {234, 87, 546, 289, 88};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {87, 88, 234, 289, 546};
        assertThat(result).containsExactly(expected);
    }
}