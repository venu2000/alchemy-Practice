package com.rep;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Person;
import com.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;

    @Autowired
    public PersonServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public Person savePerson(String name) {
        Person person = new Person();
        person.setName(name);
        return personRepository.save(person);
    }

    @Override
    public Person getPersonById(Long id) {
        return personRepository.findById(id);
    }
}
