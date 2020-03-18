package CS544.finalProject.backEnd.dao;

import java.util.List;

import CS544.finalProject.backEnd.models.Student;

public interface StudentDao {
	Student save(Student student);

	Student update(Student student);

	void delete(Student student);

	List<Student> findAll();

	Student findById(Long id);

}
