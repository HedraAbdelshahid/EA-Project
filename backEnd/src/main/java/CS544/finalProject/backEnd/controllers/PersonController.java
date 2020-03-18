package CS544.finalProject.backEnd.controllers;

import CS544.finalProject.backEnd.models.Enrollment;
import CS544.finalProject.backEnd.models.Student;
import CS544.finalProject.backEnd.models.StudentSectionDTO;
import CS544.finalProject.backEnd.services.EnrollmentService;
import CS544.finalProject.backEnd.services.StudentService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class PersonController {	
	@Autowired
	private EnrollmentService enrollmentService;
//	@Autowired StudentService stuService;
//	
//	
//	@PutMapping(value="/students/{studentId}/updateenrollment")
//	public Student saveEnrollment(@PathVariable Long studentId, @RequestBody List<Enrollment> enrollments) throws Throwable
//	{
//		Student student = stuService.findById(studentId);
//		student.setEnrollments(enrollments);
//		return stuService.update(studentId, student);
//	}
	
	@PutMapping(value="/updateenrollment/{enrollId}")
	public Enrollment updateEnrollment(@PathVariable Long enrollId, @RequestBody Enrollment enrollment) throws Throwable
	{
		return enrollmentService.update(enrollId, enrollment);
	}

}
