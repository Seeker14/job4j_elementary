package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenSumEvenNumbersFromFiftyToSixtyFiveThenFourHundredFiftySix() {
        int start = 50;
        int finish = 65;
        int result = Counter.sumByEven(start, finish);
        int expected = 456;
        assertThat(result).isEqualTo(expected);
    }
}