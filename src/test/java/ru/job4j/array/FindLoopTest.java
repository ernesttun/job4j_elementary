package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FindLoopTest {
    @Test
    public void whenArrayHas5Then0() {
        int[] data = new int[]{5, 10, 3};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int excepted = 0;
        assertThat(result).isEqualTo(excepted);
    }

    @Test
    public void whenArrayHas8Then3() {
        int[] data = new int[]{6, 9, 3, 8};
        int el = 8;
        int result = FindLoop.indexOf(data, el);
        int excepted = 3;
        assertThat(result).isEqualTo(excepted);
    }

    @Test
    public void whenArrayHasNot4ThenMinus1() {
        int[] data = new int[]{2, 7, 9};
        int el = 4;
        int result = FindLoop.indexOf(data, el);
        int excepted = -1;
        assertThat(result).isEqualTo(excepted);
    }

    @Test
    public void whenDiapasonHas8ThenResultEqualFinish() {
        int[] data = new int[]{5, 2, 10, 2, 4, 8, 14, 3, 21, 16};
        int el = 8;
        int start = 2;
        int finish = 5;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenDiapasonHasSomeEqualElementThen3() {
        int[] data = new int[]{5, 10, 2, 4, 8, 4, 14, 4, 3, 21, 16};
        int el = 4;
        int start = 1;
        int finish = 8;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenDiapasonHas2Then3() {
        int[] data = new int[]{5, 2, 10, 2, 4};
        int el = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenDiapasonHasNot8ThenMinus1() {
        int[] data = {3, 8, 9, 10, 91, 73, 64, 18, 61};
        int el = 11;
        int start = 3;
        int finish = 7;
        int rsl = FindLoop.indexInRange(data, el, start, finish);
        int excepted = -1;
        assertThat(rsl).isEqualTo(excepted);
    }

    @Test
    public void whenDiapason4Then8() {
        int[] data = {3, 1, 7, 3, 10, 45, 67, 56, 4, 10, 40};
        int el = 4;
        int start = 4;
        int finish = 10;
        int rsl = FindLoop.indexInRange(data, el, start, finish);
        int excepted = 8;
        assertThat(rsl).isEqualTo(excepted);
    }
}