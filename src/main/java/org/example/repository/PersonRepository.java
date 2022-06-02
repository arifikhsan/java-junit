package org.example.repository;

import org.example.model.Person;

public interface PersonRepository {
    Person selectById(int id);

    void insert(Person person);
}
