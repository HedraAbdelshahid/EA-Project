package CS544.finalProject.backEnd.dao;

import CS544.finalProject.backEnd.models.Course;
import CS544.finalProject.backEnd.models.Person;

import java.util.List;

public interface CourseDao {

    Course save(Course course);

    Course update(Course course);

    void delete(Course course);

    List<Course> findAll(Course course);

    Course findById(Long id);
}
