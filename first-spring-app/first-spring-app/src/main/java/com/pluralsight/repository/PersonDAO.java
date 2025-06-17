package com.pluralsight.repository;

import com.pluralsight.model.Person;

public class PersonDAO {

    public Person find(){
        return new Person("Shawn", "Carter", 55 );
    }

}
