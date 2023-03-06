package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TriangleTest {

    @Test
    public void whenExist() {
        double ab = 2.0;
        double bc = 5.0;
        double ac = 6.0;
        boolean rsl = Triangle.exist(ab, bc, ac);
        assertThat(rsl).isTrue();
    }

    @Test
    public void whenNotExist() {
        double ab = 2.0;
        double bc = 3.0;
        double ac = 9.0;
        boolean rsl = Triangle.exist(ab, bc, ac);
        assertThat(rsl).isFalse();
    }
}