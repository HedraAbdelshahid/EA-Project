package murraco.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import murraco.configuration.AppConfig;
import murraco.model.Course;
import murraco.model.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@Api(tags = "course")
public class CourseController {

    private static final String _URL = AppConfig.MICROSERVICE_URL + AppConfig.COURSES;
    private static final String _URLS = _URL + "/";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(AppConfig.COURSES)
    @PreAuthorize("hasRole('ROLE_ADMIN') or hasRole('ROLE_CLIENT')")
    @ApiResponses(value = {//
            @ApiResponse(code = 400, message = "Something went wrong"), //
            @ApiResponse(code = 403, message = "Access denied"), //
            @ApiResponse(code = 500, message = "Expired or invalid JWT token")})
    public List<Course> getAllCourse() {
        return (List<Course>) restTemplate.getForObject(_URL, Object.class);
    }

    @GetMapping(AppConfig.COURSES + "/{courseId}")
    @PreAuthorize("hasRole('ROLE_ADMIN') or hasRole('ROLE_CLIENT')")
    @ApiResponses(value = {//
            @ApiResponse(code = 400, message = "Something went wrong"), //
            @ApiResponse(code = 403, message = "Access denied"), //
            @ApiResponse(code = 500, message = "Expired or invalid JWT token")})
    public Course getCourseById(@PathVariable Long courseId) {
        return (Course) restTemplate.getForObject(_URL + courseId, Object.class);
    }

    @PostMapping(AppConfig.COURSES)
    @PreAuthorize("hasRole('ROLE_ADMIN') or hasRole('ROLE_CLIENT')")
    @ApiResponses(value = {//
            @ApiResponse(code = 400, message = "Something went wrong"), //
            @ApiResponse(code = 403, message = "Access denied"), //
            @ApiResponse(code = 500, message = "Expired or invalid JWT token")})
    public Course addCourse(@RequestBody Course course) {
        return (Course) restTemplate.postForObject(_URL, course, Object.class);
    }

    @PutMapping(AppConfig.COURSES)
    @PreAuthorize("hasRole('ROLE_ADMIN') or hasRole('ROLE_CLIENT')")
    @ApiResponses(value = {//
            @ApiResponse(code = 400, message = "Something went wrong"), //
            @ApiResponse(code = 403, message = "Access denied"), //
            @ApiResponse(code = 500, message = "Expired or invalid JWT token")})
    public Course updateCourse(@RequestBody Course course) {
        return (Course) restTemplate.postForObject(_URL, course, Object.class);
    }

    @DeleteMapping(AppConfig.COURSES + "/{courseId}")
    @PreAuthorize("hasRole('ROLE_ADMIN') or hasRole('ROLE_CLIENT')")
    @ApiResponses(value = {//
            @ApiResponse(code = 400, message = "Something went wrong"), //
            @ApiResponse(code = 403, message = "Access denied"), //
            @ApiResponse(code = 500, message = "Expired or invalid JWT token")})
    public void delete(@PathVariable Long courseId) {
        restTemplate.delete(_URLS  + courseId);
    }
}
