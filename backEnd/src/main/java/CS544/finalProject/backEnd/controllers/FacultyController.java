package CS544.finalProject.backEnd.controllers;

import java.util.List;

import CS544.finalProject.backEnd.services.FaculityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import CS544.finalProject.backEnd.models.Faculty;
import CS544.finalProject.backEnd.models.Section;
import CS544.finalProject.backEnd.models.Student;
import CS544.finalProject.backEnd.services.impl.FacultyServiceImpl;
import CS544.finalProject.backEnd.services.impl.SectionServiceImpl;

@RestController
@RequestMapping("/faculty")
public class FacultyController {

	@Autowired
	private FaculityService facultyService;

	@GetMapping("")
	public List<Faculty> getAll() throws Throwable {
		return facultyService.findAll();

	}

	@PostMapping("")
	public Faculty addFaculty(@RequestBody Faculty newFaculty) {
		return facultyService.save(newFaculty);
	}

	@PutMapping("/{id}")
	public Faculty updateFaculty(@PathVariable Long id, @RequestBody Faculty newFaculty) throws Throwable {

		return facultyService.update(id, newFaculty);
	}

	@DeleteMapping("/{id}")
	public void deleteFaculty(@PathVariable Long id) throws Throwable {
		facultyService.delete(id);
	}

	@GetMapping("/{id}/view_students")
	public List<Student> viewStudents(@PathVariable Long id) throws Throwable {
		Faculty faculty = facultyDao.findById(id);
		Long sectionId = faculty.getSection().getId();
		return facultyService.viewStudents(sectionId);
	}

}
