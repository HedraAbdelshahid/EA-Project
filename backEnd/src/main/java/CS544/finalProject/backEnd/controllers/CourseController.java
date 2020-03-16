package CS544.finalProject.backEnd.controllers;

import CS544.finalProject.backEnd.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
    @Autowired
    private CourseService courseService;
}
