package murraco.controller;

import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import murraco.configuration.AppConfig;
import murraco.model.Student;
import murraco.model.StudentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class StudentController {

    private static final String _URL = AppConfig.MICROSERVICE_URL + AppConfig.STUDENTS_OTHER;
    private static final String _URLS = _URL + "/";

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping(AppConfig.STUDENTS)
    @PreAuthorize("hasRole('ROLE_ADMIN') or hasRole('ROLE_CLIENT')")
    @ApiResponses(value = {//
            @ApiResponse(code = 400, message = "Something went wrong"), //
            @ApiResponse(code = 403, message = "Access denied"), //
            @ApiResponse(code = 500, message = "Expired or invalid JWT token")})
    public Student addStudent(@RequestBody Student student) {
        return (Student) restTemplate.postForObject(_URL, student, Object.class);
    }

    @GetMapping(AppConfig.STUDENTS)
    @PreAuthorize("hasRole('ROLE_ADMIN') or hasRole('ROLE_CLIENT')")
    @ApiResponses(value = {//
            @ApiResponse(code = 400, message = "Something went wrong"), //
            @ApiResponse(code = 403, message = "Access denied"), //
            @ApiResponse(code = 500, message = "Expired or invalid JWT token")})
    public List<Student> getAll() {
        return (List<Student>) restTemplate.getForObject(_URL, Object.class);
    }

    @PutMapping(AppConfig.STUDENTS + "{studentId}")
    @PreAuthorize("hasRole('ROLE_ADMIN') or hasRole('ROLE_CLIENT')")
    @ApiResponses(value = {//
            @ApiResponse(code = 400, message = "Something went wrong"), //
            @ApiResponse(code = 403, message = "Access denied"), //
            @ApiResponse(code = 500, message = "Expired or invalid JWT token")})
    public Student updateStudent(@PathVariable long studentId, @RequestBody Student student) {
        return (Student) restTemplate.postForObject(_URLS + studentId, student, Object.class);
    }

    @DeleteMapping(AppConfig.STUDENTS + "{studentId}")
    @PreAuthorize("hasRole('ROLE_ADMIN') or hasRole('ROLE_CLIENT')")
    @ApiResponses(value = {//
            @ApiResponse(code = 400, message = "Something went wrong"), //
            @ApiResponse(code = 403, message = "Access denied"), //
            @ApiResponse(code = 500, message = "Expired or invalid JWT token")})
    public void deleteStudent(@PathVariable long studentId) {
        restTemplate.delete(_URLS + studentId);
    }

    @PutMapping(AppConfig.STUDENTS + "{studentId}/enroll")
    public Student enroll(@PathVariable Long studentId, @RequestBody StudentDTO studentDTO) {
        return (Student) restTemplate.postForObject(_URLS + studentId + "/enroll", studentDTO, Object.class);
    }

}
