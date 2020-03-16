package CS544.finalProject.backEnd.controllers;

import CS544.finalProject.backEnd.dao.PersonDao;
import CS544.finalProject.backEnd.models.Person;
import CS544.finalProject.backEnd.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class PersonController {

    @Autowired
    private PersonService personService;


}
