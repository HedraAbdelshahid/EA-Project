package CS544.finalProject.backEnd.services;

import CS544.finalProject.backEnd.models.*;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface StudentService {
	Student save(Student student);

	Student update(long studentId, Student student) throws Throwable;

	ResponseEntity<Void> delete(long studentId) throws Throwable;

	List<Student> findAll();

	Student findById(Long id) throws Throwable;

	Student enrol(StudentSectionDTO studentSectionDTO) throws Throwable;

}
