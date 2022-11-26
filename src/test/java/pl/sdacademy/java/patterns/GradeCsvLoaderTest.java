package pl.sdacademy.java.patterns;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class GradeCsvLoaderTest {

    @Test
    void shouldLoadGrades() {
        GradeCsvLoader gradeCsvLoader = new GradeCsvLoader(
                () -> GradeCsvLoaderTest.class.getResourceAsStream("/grades.csv")
        );

        List<Grade> grades = gradeCsvLoader.loadGrades();

        assertThat(grades).hasSize(6);
        assertThat(grades).extracting(Grade::getValue).containsExactly(
                new BigDecimal("5"),
                new BigDecimal("4"),
                new BigDecimal("3"),
                new BigDecimal("2")
        );

    }

}
