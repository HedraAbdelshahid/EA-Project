package CS544.finalProject.backEnd.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import CS544.finalProject.backEnd.dao.StudentDao;
import CS544.finalProject.backEnd.models.Student;
import CS544.finalProject.backEnd.repository.StudentRepository;

@Component
@Transactional(propagation = Propagation.MANDATORY)
public class StudentDaoImpl implements StudentDao {
	@Autowired

	private StudentRepository studentRepository;

	@Override
	public Student save(Student student) {

		return studentRepository.save(student);
	}

	@Override
	public Student update(Student student) {
		return studentRepository.save(student);
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
	public Student findById(Long id) {
		return studentRepository.findById(id).orElseThrow();
	}

}
