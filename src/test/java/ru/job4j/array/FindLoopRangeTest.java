package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class FindLoopRangeTest {
    @Test
    public void whenArrayHas5Then0() {
        int[] data = new int[] {5, 10, 3};
        int el = 5;
        int result = FindLoopRange.indexOf(data, el);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenDiapasonHas8ThenResultEqualFinish() {
        int[] data = new int[] {5, 2, 10, 2, 4, 8, 14, 3, 21, 16};
        int el = 8;
        int start = 2;
        int finish = 5;
        int result = FindLoopRange.indexInRange(data, el, start, finish);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenDiapasonHasSomeEqualElementThen3() {
        int[] data = new int[] {5, 10, 2, 4, 8, 4, 14, 4, 3, 21, 16};
        int el = 4;
        int start = 1;
        int finish = 8;
        int result = FindLoopRange.indexInRange(data, el, start, finish);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenDiapasonHas2Then3() {
        int[] data = new int[] {5, 2, 10, 2, 4};
        int el = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoopRange.indexInRange(data, el, start, finish);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenDiapasonHasNot8ThenMinus1() {
        int[] data = new int[] {1, 6, 8, 3, 2, 11, 27, 31};
        int el = 8;
        int start = 3;
        int finish = 7;
        int result = FindLoopRange.indexInRange(data, el, start, finish);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenArrayHasNot3ThenMinus1() {
        int[] data = new int[] {8, 9, 10, 11, 12, 13};
        int el = 3;
        int result = FindLoopRange.indexOf(data, el);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenDiapasonHas12Then9() {
        int[] data = new int[] {1, 14, 23, 99, 101, 28, 11, 32, 56, 12, 92, 47, 15, 86};
        int el = 12;
        int start = 5;
        int finish = 11;
        int result = FindLoopRange.indexInRange(data, el, start, finish);
        int expected = 9;
        assertThat(result).isEqualTo(expected);
    }
}