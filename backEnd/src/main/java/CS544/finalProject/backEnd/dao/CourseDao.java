package CS544.finalProject.backEnd.dao;

import CS544.finalProject.backEnd.models.Course;
import CS544.finalProject.backEnd.models.Person;

import java.util.List;
import java.util.Optional;

public interface CourseDao {

    Course save(Course course);

    Course update(Course course);

    void delete(Long courseId);

    List<Course> findAll();

    Optional<Course> findById(Long id);
}
