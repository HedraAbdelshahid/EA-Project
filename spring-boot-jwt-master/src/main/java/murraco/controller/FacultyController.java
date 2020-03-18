package murraco.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import murraco.configuration.AppConfig;
import murraco.model.Faculty;
import murraco.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@Api(tags = "faculty")
public class FacultyController {

    private static final String _URL = AppConfig.MICROSERVICE_URL + AppConfig.FACULTY_OTHER;
    private static final String _URLS = _URL + "/";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(AppConfig.FACULTY)
    @PreAuthorize("hasRole('ROLE_ADMIN') or hasRole('ROLE_CLIENT')")
    @ApiResponses(value = {//
            @ApiResponse(code = 400, message = "Something went wrong"), //
            @ApiResponse(code = 403, message = "Access denied"), //
            @ApiResponse(code = 500, message = "Expired or invalid JWT token")})

    public List<Faculty> getAll() throws Throwable {
        return (List<Faculty>) restTemplate.getForObject(_URL, Object.class);

    }

    @PostMapping(AppConfig.FACULTY)
    @PreAuthorize("hasRole('ROLE_ADMIN') or hasRole('ROLE_CLIENT')")
    @ApiResponses(value = {//
            @ApiResponse(code = 400, message = "Something went wrong"), //
            @ApiResponse(code = 403, message = "Access denied"), //
            @ApiResponse(code = 500, message = "Expired or invalid JWT token")})

    public Faculty addFaculty(@RequestBody Faculty newFaculty) {
        return (Faculty) restTemplate.postForObject(_URL, newFaculty, Object.class);
    }

    @PutMapping(AppConfig.FACULTY + "/{id}")
    @PreAuthorize("hasRole('ROLE_ADMIN') or hasRole('ROLE_CLIENT')")
    @ApiResponses(value = {//
            @ApiResponse(code = 400, message = "Something went wrong"), //
            @ApiResponse(code = 403, message = "Access denied"), //
            @ApiResponse(code = 500, message = "Expired or invalid JWT token")})
    public Faculty updateFaculty(@PathVariable Long id, @RequestBody Faculty newFaculty) throws Throwable {
        return (Faculty) restTemplate.postForObject(_URLS + id, newFaculty, Object.class);
    }

    @DeleteMapping(AppConfig.FACULTY + "/{id}")
    @PreAuthorize("hasRole('ROLE_ADMIN') or hasRole('ROLE_CLIENT')")
    @ApiResponses(value = {//
            @ApiResponse(code = 400, message = "Something went wrong"), //
            @ApiResponse(code = 403, message = "Access denied"), //
            @ApiResponse(code = 500, message = "Expired or invalid JWT token")})
    public void deleteFaculty(@PathVariable Long id) throws Throwable {
        restTemplate.delete(_URLS + id);
    }

    @GetMapping(AppConfig.FACULTY + "/{id}/viewStudents")
    public List<Student> viewStudents(@PathVariable Long id) throws Throwable {
        return (List<Student>) restTemplate.getForObject(_URLS + id + "/viewStudents", Object.class);

    }

}
