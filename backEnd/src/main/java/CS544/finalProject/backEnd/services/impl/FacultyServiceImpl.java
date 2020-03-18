package CS544.finalProject.backEnd.services.impl;

import java.util.List;

import javax.sql.DataSource;

import CS544.finalProject.backEnd.models.Section;
import CS544.finalProject.backEnd.services.EnrollmentService;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import CS544.finalProject.backEnd.dao.FacultyDao;

import CS544.finalProject.backEnd.models.Faculty;
import CS544.finalProject.backEnd.models.Student;
import CS544.finalProject.backEnd.services.FaculityService;

@Service
@Transactional(propagation = Propagation.REQUIRES_NEW)
public class FacultyServiceImpl implements FaculityService {


    @Autowired
    private FacultyDao facultyDao;

    @Autowired
    private EnrollmentService enrollmentService;

    @Override
    public Faculty save(Faculty faculty) {
        return facultyDao.save(faculty);
    }


    @Override
    public void delete(Long id) {
        facultyDao.deleteById(id);
    }

    @Override
    public List<Faculty> findAll() {
        return facultyDao.findAll();
    }

    @Override
    public Faculty findById(Long id) {
        return facultyDao.findById(id);
    }

    @Override
    public List<Student> viewStudents(Long id) {
        return facultyDao.getStudents(id);
    }

    @Override
    public Faculty update(Long id, Faculty faculty) {
        return facultyDao.update(id, faculty);
    }


}
