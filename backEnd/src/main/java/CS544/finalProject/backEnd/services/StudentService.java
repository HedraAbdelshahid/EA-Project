package CS544.finalProject.backEnd.services;

import CS544.finalProject.backEnd.models.Enrollment;
import CS544.finalProject.backEnd.models.Student;

import java.util.List;

import org.springframework.http.ResponseEntity;

public interface StudentService {

	Student save(Student student);

	Student update(long studentId, Student studentDetails) throws Throwable;

	ResponseEntity<Void> delete(long studentId) throws Throwable;

	List<Student> findAll();

	Student findById(Long id) throws Throwable;

	Enrollment enrol(Long studentId, Long sectionId);

}
