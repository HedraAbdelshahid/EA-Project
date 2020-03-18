package CS544.finalProject.backEnd.dao.impl;

import CS544.finalProject.backEnd.dao.CourseDao;
import CS544.finalProject.backEnd.models.Course;
import CS544.finalProject.backEnd.models.Person;
import CS544.finalProject.backEnd.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class CourseDaoImpl implements CourseDao {

	@Autowired
	CourseRepository courseRepository;

	@Override
	public Course save(Course course) {
		return courseRepository.save(course);
	}

	@Override
	public Course update(Course course) {
		return null;
	}

	@Override
	public void delete(Course course) {

	}

	@Override
	public List<Course> findAll(Course course) {
		return null;
	}

	@Override
	public Course findById(Long id) {
		return null;
	}
}
