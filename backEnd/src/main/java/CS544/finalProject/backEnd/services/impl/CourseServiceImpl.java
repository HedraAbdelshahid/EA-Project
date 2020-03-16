package CS544.finalProject.backEnd.services.impl;

import CS544.finalProject.backEnd.dao.CourseDao;
import CS544.finalProject.backEnd.models.Course;
import CS544.finalProject.backEnd.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseDao courseDao;

    @Override
    public Course save(Course course) {
        return null;
    }

    @Override
    public Course update(Course course) {
        return null;
    }

    @Override
    public void delete(Course course) {

    }

    @Override
    public List<Course> findAll() {
        return null;
    }

    @Override
    public Course findById(Long id) {
        return null;
    }
}
