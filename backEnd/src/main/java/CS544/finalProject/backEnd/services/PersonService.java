package CS544.finalProject.backEnd.services;

import CS544.finalProject.backEnd.models.Person;
import org.springframework.stereotype.Service;

import java.util.List;

public interface PersonService {

    Person save(Person Person);

    Person update(Person Person);

    void delete(Person Person);

    List<Person> findAll();

    Person findById(Long id);
}
