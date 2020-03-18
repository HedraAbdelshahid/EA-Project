package CS544.finalProject.backEnd.services.impl;

import CS544.finalProject.backEnd.dao.CourseDao;
import CS544.finalProject.backEnd.models.Course;
import CS544.finalProject.backEnd.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseDao courseDao;

    @Override
    public Course save(Course course) {
        return courseDao.save(course);
    }

    @Override
    public Course update(Course course) {
        return courseDao.update(course);
    }

    @Override
    public void delete(Long courseId) {
        courseDao.delete(courseId);
    }

    @Override
    public List<Course> findAll() {
        return courseDao.findAll();
    }

    @Override
    public Optional<Course> findById(Long id) {
        return courseDao.findById(id);
    }
}
