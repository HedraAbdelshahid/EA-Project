package CS544.finalProject.backEnd.services;

import java.util.List;

import CS544.finalProject.backEnd.models.Faculty;
import CS544.finalProject.backEnd.models.Student;


public interface FaculityService {

    Faculty save(Faculty faculty);

    Faculty update(Long id,Faculty faculty);

    void delete(Long id);

    List<Faculty> findAll();

    Faculty findById(Long id);

    List<Student> viewStudents(Long id);
   
}
