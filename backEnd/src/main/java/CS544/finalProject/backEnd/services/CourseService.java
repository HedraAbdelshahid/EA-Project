package CS544.finalProject.backEnd.services;

import CS544.finalProject.backEnd.models.Course;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CourseService {

    Course save(Course course);

    Course update(Course course);

    void delete(Course course);

    List<Course> findAll();

    Course findById(Long id);
}
