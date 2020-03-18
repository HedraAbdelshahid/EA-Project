package CS544.finalProject.backEnd.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import CS544.finalProject.backEnd.models.Student;
import CS544.finalProject.backEnd.models.StudentSectionDTO;
import CS544.finalProject.backEnd.services.StudentService;

@RestController
public class StundentController {

	@Autowired
	private StudentService studentService;

	@PostMapping(value = "students/add", consumes = "application/json")
	public Student addStudent(@RequestBody Student student) {
		return studentService.save(student);
	}

	@PostMapping(value = "/enrollments"/* , consumes = "application/json" */)
	public Student enrollStudent(@RequestBody StudentSectionDTO studentSectionDTO) throws Throwable {

		return studentService.enrol(studentSectionDTO);

	}
}
