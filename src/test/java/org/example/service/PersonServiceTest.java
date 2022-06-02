package org.example.service;

import org.example.model.Person;
import org.example.repository.PersonRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@Extensions({
        @ExtendWith(MockitoExtension.class)
})
public class PersonServiceTest {
    @Mock
    private PersonRepository personRepository;
    private PersonService personService;

    @BeforeEach
    void setUp() {
        personService = new PersonService(personRepository);
    }

    @Test
    void testNotFound() {
        assertThrows(IllegalArgumentException.class, () -> personService.getById(1));
    }

    @Test
    void testFound() {
        when(personRepository.selectById(1)).thenReturn(new Person(1, "Arif"));
        var person = personService.getById(1);
        assert person.getId() == 1;
    }

    @SuppressWarnings("ObviousNullCheck")
    @Test
    void register() {
        var person = personService.register("Arif");
        assertNotNull(person);
        assertEquals("Arif", person.getName());
        assertNotNull(person.getId());

        verify(personRepository, times(1)).insert(person);
    }
}
