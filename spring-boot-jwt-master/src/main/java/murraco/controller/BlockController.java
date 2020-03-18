package murraco.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import murraco.configuration.AppConfig;
import murraco.model.Block;
import murraco.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@Api(tags = "block")
public class BlockController {

    private static final String _URL = AppConfig.MICROSERVICE_URL + AppConfig.BLOCKS;
    private static final String _URLS = _URL + "/";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(AppConfig.BLOCKS)
    @PreAuthorize("hasRole('ROLE_ADMIN') or hasRole('ROLE_CLIENT')")
    @ApiResponses(value = {//
            @ApiResponse(code = 400, message = "Something went wrong"), //
            @ApiResponse(code = 403, message = "Access denied"), //
            @ApiResponse(code = 500, message = "Expired or invalid JWT token")})
    public List<Block> getAllCourse() {
        return (List<Block>) restTemplate.getForObject(_URL, Object.class);
    }


    @GetMapping(AppConfig.BLOCKS + "/{blockId}")
    @PreAuthorize("hasRole('ROLE_ADMIN') or hasRole('ROLE_CLIENT')")
    @ApiResponses(value = {//
            @ApiResponse(code = 400, message = "Something went wrong"), //
            @ApiResponse(code = 403, message = "Access denied"), //
            @ApiResponse(code = 500, message = "Expired or invalid JWT token")})
    public Block getCourseById(@PathVariable Long blockId) {
        return (Block) restTemplate.getForObject(_URL + blockId, Object.class);
    }

    @PostMapping(AppConfig.BLOCKS)
    @PreAuthorize("hasRole('ROLE_ADMIN') or hasRole('ROLE_CLIENT')")
    @ApiResponses(value = {//
            @ApiResponse(code = 400, message = "Something went wrong"), //
            @ApiResponse(code = 403, message = "Access denied"), //
            @ApiResponse(code = 500, message = "Expired or invalid JWT token")})
    public Block addCourse(@RequestBody Block course) {
        return (Block) restTemplate.postForObject(_URL, course, Object.class);
    }

    @PutMapping(AppConfig.BLOCKS)
    @PreAuthorize("hasRole('ROLE_ADMIN') or hasRole('ROLE_CLIENT')")
    @ApiResponses(value = {//
            @ApiResponse(code = 400, message = "Something went wrong"), //
            @ApiResponse(code = 403, message = "Access denied"), //
            @ApiResponse(code = 500, message = "Expired or invalid JWT token")})
    public Block updateCourse(@RequestBody Block course) {
        return (Block) restTemplate.postForObject(_URL, course, Object.class);
    }

    @DeleteMapping(AppConfig.BLOCKS + "/{blockId}")
    @PreAuthorize("hasRole('ROLE_ADMIN') or hasRole('ROLE_CLIENT')")
    @ApiResponses(value = {//
            @ApiResponse(code = 400, message = "Something went wrong"), //
            @ApiResponse(code = 403, message = "Access denied"), //
            @ApiResponse(code = 500, message = "Expired or invalid JWT token")})
    public void delete(@PathVariable Long blockId) {
        restTemplate.delete(_URLS + blockId);
    }


}
