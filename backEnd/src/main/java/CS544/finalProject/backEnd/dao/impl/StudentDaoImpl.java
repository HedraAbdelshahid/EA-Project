package CS544.finalProject.backEnd.dao.impl;

import CS544.finalProject.backEnd.dao.StudentDao;
import CS544.finalProject.backEnd.models.Student;
import CS544.finalProject.backEnd.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
@Component
public class StudentDaoImpl implements StudentDao {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student save(Student student) {
        return (Student) studentRepository.save(student);
    }

    @Override
    public Student update(long studentId,Student student) {
        return (Student) studentRepository.save(student);
    }

    @Override
    public void delete(Student student) {
        studentRepository.delete(student);
    }

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Optional<Student> findById(Long id) {
        return studentRepository.findById(id);
    }
}
