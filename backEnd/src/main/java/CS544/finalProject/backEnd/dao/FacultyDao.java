package CS544.finalProject.backEnd.dao;

import java.util.List;

import CS544.finalProject.backEnd.models.Faculty;

public interface FacultyDao {

    Faculty save(Faculty faculty);

    Faculty update(Long id, Faculty faculty);

    void deleteById(Long id);

    List<Faculty> findAll();

    Faculty findById(Long id);

    List<Student> getStudents(Long id);

}
