package org.example.service;

import org.example.model.Person;
import org.example.repository.PersonRepository;

//@RequiredArgsConstructor
public class PersonService {
    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Person getById(int id) {
        var person = personRepository.selectById(id);
        if (person == null) throw new IllegalArgumentException("Person not found");
        return person;
    }

    public Person register(String name) {
        var id = (int) (Math.random() * 100);
        var person = new Person(id, name);
        personRepository.insert(person);
        return person;
    }
}
