package CS544.finalProject.backEnd.controllers;

import CS544.finalProject.backEnd.models.Student;
import CS544.finalProject.backEnd.models.StudentSectionDTO;
import CS544.finalProject.backEnd.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;

	@GetMapping("/students")
	public List<Student> getAll() throws Throwable {
//
//        Student student = new Student("a@b.com", "Thomas", 1L);
//        studentService.save(student);
//
//        StudentSectionDTO studentSectionDTO1 = new StudentSectionDTO();
//        studentSectionDTO1.setStudentId(1L);
//        studentSectionDTO1.setSectionIds(Arrays.asList(1L, 2L, 3L, 4L));
//        studentService.enrol(studentSectionDTO1);
//

		return studentService.findAll();
	}

	@PutMapping("/students/{studentId}")
	public Student updateStudent(@PathVariable long studentId, @RequestBody Student student) throws Throwable {
		return studentService.update(studentId, student);
	}

	@DeleteMapping("/students/{studentId}")
	public ResponseEntity<Void> deleteStudent(@PathVariable long studentId) throws Throwable {
		return studentService.delete(studentId);
	}

//    @PutMapping("/students/{studentId}/enroll")
//    public Student enroll(@PathVariable Long studentId, @RequestBody StudentDTO studentDTO) throws Throwable {
//            return studentService.enroll(studentId,studentDTO);
//
//    }

	@PostMapping(value = "students/add", consumes = "application/json")
	public Student addStudent(@RequestBody Student student) {
		return studentService.save(student);
	}

	@PostMapping(value = "/enrollments"/* , consumes = "application/json" */)
	public Student enrollStudent(@RequestBody StudentSectionDTO studentSectionDTO) throws Throwable {

		return studentService.enrol(studentSectionDTO);

	}
}
