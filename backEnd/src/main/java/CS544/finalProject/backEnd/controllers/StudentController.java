package CS544.finalProject.backEnd.controllers;

import CS544.finalProject.backEnd.models.Section;
import CS544.finalProject.backEnd.models.Student;
import CS544.finalProject.backEnd.models.StudentDTO;
import CS544.finalProject.backEnd.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/students")
    public Student addStudent(@RequestBody Student student) {
        return studentService.save(student);
    }

    @GetMapping("/students")
    public List<Student> getAll() {

//        Student student = new Student("a@b.com", "Thomas", (long) 12345);
//        List<Section> sections = new ArrayList<>();
//        sections.add(new Section("20"));
//        sections.add(new Section("21"));
//        sections.add(new Section("22"));
//        sections.add(new Section("23"));
//        student.setSections(sections);
//        studentService.save(student);

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


    @PutMapping("/students/{studentId}/enroll")
    public Student enroll(@PathVariable Long studentId, @RequestBody StudentDTO studentDTO) throws Throwable {
            return studentService.enroll(studentId,studentDTO);

    }

}
