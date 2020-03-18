package CS544.finalProject.backEnd.dao.impl;

import CS544.finalProject.backEnd.dao.PersonDao;
import CS544.finalProject.backEnd.models.Person;
import CS544.finalProject.backEnd.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PersonDaoImpl implements PersonDao {

    @Autowired
    private PersonRepository personRepository;


    @Override
    public Person save(Person Person) {
        return null;
    }

    @Override
    public Person update(Person Person) {
        return null;
    }

    @Override
    public void delete(Person Person) {

    }

    @Override
    public List<Person> findAll(Person Person) {
        return null;
    }

    @Override
    public Person findById(Long id) {
        return null;
    }
}
