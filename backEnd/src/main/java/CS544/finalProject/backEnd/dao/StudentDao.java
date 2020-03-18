package CS544.finalProject.backEnd.dao;

import CS544.finalProject.backEnd.models.Student;

import java.util.List;
import java.util.Optional;

public interface StudentDao {

    Student save(Student student);

    Student update(long studentId,Student student);

    void delete(Student student);

    List<Student> findAll();

    Optional findById(Long id);
}
