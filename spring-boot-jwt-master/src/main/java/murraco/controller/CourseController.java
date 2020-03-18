package murraco.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import murraco.dto.UserResponseDTO;
import murraco.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
//@RequestMapping(value = AppConfig.COURSE)
public class CourseController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/courses")
    @PreAuthorize("hasRole('ROLE_ADMIN') or hasRole('ROLE_CLIENT')")
    @ApiResponses(value = {//
            @ApiResponse(code = 400, message = "Something went wrong"), //
            @ApiResponse(code = 403, message = "Access denied"), //
            @ApiResponse(code = 500, message = "Expired or invalid JWT token")})
    public List<Course> getAllCourse() {
        RestTemplate restTemplate = new RestTemplate();
        return (List<Course>) restTemplate.getForObject("http://localhost:8080/api/v1/courses", Course.class);
    }

}
