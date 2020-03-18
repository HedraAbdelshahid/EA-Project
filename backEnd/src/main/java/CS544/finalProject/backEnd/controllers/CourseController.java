package CS544.finalProject.backEnd.controllers;

import CS544.finalProject.backEnd.config.AppConfig;
import CS544.finalProject.backEnd.exceptions.ResourceNotFoundException;
import CS544.finalProject.backEnd.models.Course;
import CS544.finalProject.backEnd.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
//@RequestMapping(value = AppConfig.COURSE)
public class CourseController {

    @Autowired
    private CourseService courseService;


    @GetMapping(AppConfig.COURSES)
    public List<Course> getAllCourse() {
        return courseService.findAll();
    }

    @GetMapping(AppConfig.COURSES + "/{courseId}")
    public Course getCourseById(@PathVariable Long courseId) {

        return courseService.findById(courseId).orElseThrow(()->new ResourceNotFoundException("Course Not Found"));
    }

    @PostMapping(AppConfig.COURSES)
    public Course addCourse(@RequestBody Course course) {
        return courseService.save(course);
    }

    @PutMapping(AppConfig.COURSES)
    public Course updateCourse(@RequestBody Course course) {
        return courseService.update(course);
    }

    @DeleteMapping(AppConfig.COURSES + "/{courseId}")
    public void delete(@PathVariable Long courseId) {
        courseService.delete(courseId);
    }
}
