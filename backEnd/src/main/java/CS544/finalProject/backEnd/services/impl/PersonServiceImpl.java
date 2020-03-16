package CS544.finalProject.backEnd.services.impl;

import CS544.finalProject.backEnd.dao.PersonDao;
import CS544.finalProject.backEnd.models.Person;
import CS544.finalProject.backEnd.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonDao personDao;

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
    public List<Person> findAll() {
        return null;
    }

    @Override
    public Person findById(Long id) {
        return null;
    }
}
