package CS544.finalProject.backEnd.dao;

import CS544.finalProject.backEnd.models.Person;

import java.util.List;

public interface PersonDao  {

    Person save(Person Person);

    Person update(Person Person);

    void delete(Person Person);

    List<Person> findAll(Person Person);

    Person findById(Long id);
}
