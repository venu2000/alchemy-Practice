package com.rep;

import com.entity.Person;

public interface PersonRepository {
	
	Person save(Person person);
    Person findById(Long id);

}
