package CS544.finalProject.backEnd.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import CS544.finalProject.backEnd.models.Enrollment;
import CS544.finalProject.backEnd.services.EnrollmentService;

@RestController
public class EnrollmentController {
	@Autowired
	private EnrollmentService enrollmentService;

	@PostMapping(value = "/enrolli", consumes = MediaType.APPLICATION_JSON_VALUE)
	public Enrollment addEnrollment(@RequestBody Enrollment enrollment) {
		return enrollmentService.save(enrollment);
	}

}
