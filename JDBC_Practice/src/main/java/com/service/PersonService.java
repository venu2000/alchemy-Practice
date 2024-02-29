package com.service;

import com.entity.Person;

public interface PersonService {
    Person savePerson(String name);
    Person getPersonById(Long id);
}