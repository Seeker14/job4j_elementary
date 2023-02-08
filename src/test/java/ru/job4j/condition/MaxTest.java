package ru.job4j.condition;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax7To3Then7() {
        int left = 7;
        int right = 3;
        int result = Max.max(left, right);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax0To1Then1() {
        int left = 0;
        int right = 1;
        int result = Max.max(left, right);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax12To12Then12() {
        int left = 12;
        int right = 12;
        int result = Max.max(left, right);
        int expected = 12;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax99To98To74Then99() {
        int left = 99;
        int right = 98;
        int bottom = 74;
        int result = Max.max(left, right, bottom);
        int expected = 99;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax45To46To34Then46() {
        int left = 45;
        int right = 46;
        int bottom = 34;
        int result = Max.max(left, right, bottom);
        int expected = 46;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax2To3To4Then4() {
        int left = 2;
        int right = 3;
        int bottom = 4;
        int result = Max.max(left, right, bottom);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax112To43To28To57Then112() {
        int left = 112;
        int right = 43;
        int bottom = 28;
        int top = 57;
        int result = Max.max(left, right, bottom, top);
        int expected = 112;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax11To13To2To7Then13() {
        int left = 11;
        int right = 13;
        int bottom = 2;
        int top = 7;
        int result = Max.max(left, right, bottom, top);
        int expected = 13;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax17To4To18To3Then18() {
        int left = 17;
        int right = 4;
        int bottom = 18;
        int top = 3;
        int result = Max.max(left, right, bottom, top);
        int expected = 18;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax1To2To3To4Then4() {
        int left = 1;
        int right = 2;
        int bottom = 3;
        int top = 4;
        int result = Max.max(left, right, bottom, top);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }
}