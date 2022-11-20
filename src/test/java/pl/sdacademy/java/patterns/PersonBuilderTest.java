package pl.sdacademy.java.patterns;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PersonBuilderTest {
    @Test
    void shouldCreatePersonWithGivenUuid() {
        Person person = new PersonBuilder()
                .firstName("Jan")
                .lastName("Kowalski")
                .build();

        assertThat(person).isNotNull();
        assertThat(person).isEqualTo("4a");
        assertThat(person.getFirstName()).isEqualTo("Jan");
        assertThat(person.getLastName()).isEqualTo("Kowalski");
    }
}
