package CS544.finalProject.backEnd.services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import CS544.finalProject.backEnd.models.Enrollment;
import CS544.finalProject.backEnd.models.Section;

public interface EnrollmentService {
	Enrollment save(Enrollment enrollment);

	Enrollment update(Long Id, Enrollment enrollmentDetails) throws Throwable;

	ResponseEntity<Void> delete(Long Id) throws Throwable;

	List<Enrollment> findAll();

	Enrollment findById(Long id);

	List<Enrollment> makeEnrollment(List<Enrollment> enrollments);

//	public List<Section> currentenrollmentOfStundent(Long studentId);

}
