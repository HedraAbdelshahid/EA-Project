package CS544.finalProject.backEnd.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import CS544.finalProject.backEnd.models.Section;
import CS544.finalProject.backEnd.models.SectionWrapper;
import CS544.finalProject.backEnd.models.Student;
import CS544.finalProject.backEnd.services.StudentService;

@RestController
public class StundentController {

	@Autowired
	private StudentService studentService;

	@PostMapping(value = "students/add", consumes = "application/json")
	public Student addStudent(@RequestBody Student student) {
		return studentService.save(student);
	}

	@PostMapping(value = "students/enroll/{studentId}/{sectionId}", consumes = "application/json")
	public List<Section> enrollStudent(@PathVariable Long sectionId, @PathVariable Long studentId) {
		List<Section> sections = enrolledsections.getSections();

		return studentService.enrol(studentId, sections);

	}
}
