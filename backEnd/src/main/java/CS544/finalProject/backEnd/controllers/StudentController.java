package CS544.finalProject.backEnd.controllers;

import CS544.finalProject.backEnd.models.Enrollment;
import CS544.finalProject.backEnd.models.EnrollmentDTO;
import CS544.finalProject.backEnd.models.Student;
import CS544.finalProject.backEnd.models.StudentSectionDTO;
import CS544.finalProject.backEnd.services.EnrollmentService;
import CS544.finalProject.backEnd.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;
	@Autowired
	private EnrollmentService enrollmentService;

	@GetMapping("/enrollments/{enrollmentId}")
	public EnrollmentDTO getEnrollment(@PathVariable Long enrollmentId) {
		Enrollment e = enrollmentService.findById(enrollmentId);
		EnrollmentDTO dto = new EnrollmentDTO();
		dto.setId(e.getId());
		dto.setSectionID(e.getSection().getId());
		dto.setStudentID(e.getStudent().getId());

		return dto;

	}

	@GetMapping("/students")
	public List<Student> getAll() throws Throwable {

		return studentService.findAll();
	}

	@GetMapping("/students/{studentId}")
	public Student getStudent(@PathVariable Long studentId) throws Throwable {
		return studentService.findById(studentId);
	}

	@PutMapping("/students/{studentId}")
	public Student updateStudent(@PathVariable long studentId, @RequestBody Student student) throws Throwable {
		return studentService.update(studentId, student);
	}

	@DeleteMapping("/students/{studentId}")
	public ResponseEntity<Void> deleteStudent(@PathVariable long studentId) throws Throwable {
		return studentService.delete(studentId);
	}

	@PostMapping(value = "/students", consumes = "application/json")
	public Student addStudent(@RequestBody Student student) {
		return studentService.save(student);
	}

	@PostMapping(value = "students/enrollments")
	public Student enrollStudent(@RequestBody StudentSectionDTO studentSectionDTO) throws Throwable {

		return studentService.enrol(studentSectionDTO);

	}
}
