package murraco.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import murraco.configuration.AppConfig;
import murraco.model.Block;
import murraco.model.Section;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@Api(tags = "section")
public class SectionController {

    private static final String _URL = AppConfig.MICROSERVICE_URL + AppConfig.SECTIONS;
    private static final String _URLS = _URL + "/";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = AppConfig.SECTIONS)
    @PreAuthorize("hasRole('ROLE_ADMIN') or hasRole('ROLE_CLIENT')")
    @ApiResponses(value = {//
            @ApiResponse(code = 400, message = "Something went wrong"), //
            @ApiResponse(code = 403, message = "Access denied"), //
            @ApiResponse(code = 500, message = "Expired or invalid JWT token")})
    public List<Section> getAllSections() {
        return (List<Section>) restTemplate.getForObject(_URL, Object.class);
    }

    @PostMapping(value = AppConfig.SECTIONS + "/{sectionId}")
    @PreAuthorize("hasRole('ROLE_ADMIN') or hasRole('ROLE_CLIENT')")
    @ApiResponses(value = {//
            @ApiResponse(code = 400, message = "Something went wrong"), //
            @ApiResponse(code = 403, message = "Access denied"), //
            @ApiResponse(code = 500, message = "Expired or invalid JWT token")})
    public Section updateSection(@PathVariable Long sectionId, Section sectionDetail) {
        return (Section) restTemplate.postForObject(_URLS + sectionId, sectionDetail, Object.class);
    }

    @DeleteMapping(value = AppConfig.SECTIONS + "/delete/{sectionId}")
    @PreAuthorize("hasRole('ROLE_ADMIN') or hasRole('ROLE_CLIENT')")
    @ApiResponses(value = {//
            @ApiResponse(code = 400, message = "Something went wrong"), //
            @ApiResponse(code = 403, message = "Access denied"), //
            @ApiResponse(code = 500, message = "Expired or invalid JWT token")})
    public void deleteSection(@PathVariable Long sectionId) throws Throwable {
        restTemplate.delete(_URLS + sectionId);
    }
}
