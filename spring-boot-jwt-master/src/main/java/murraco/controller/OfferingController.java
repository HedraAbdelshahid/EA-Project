package murraco.controller;

import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import murraco.configuration.AppConfig;
import murraco.model.Offering;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class OfferingController {

    private static final String _URL = AppConfig.MICROSERVICE_URL + AppConfig.OFFERINGS;
    private static final String _URLS = _URL + "/";

    @Autowired
    private RestTemplate restTemplate;


    @GetMapping(AppConfig.OFFERINGS)
    @PreAuthorize("hasRole('ROLE_ADMIN') or hasRole('ROLE_CLIENT')")
    @ApiResponses(value = {//
            @ApiResponse(code = 400, message = "Something went wrong"), //
            @ApiResponse(code = 403, message = "Access denied"), //
            @ApiResponse(code = 500, message = "Expired or invalid JWT token")})
    public List<Offering> getAllOfferings() {
        return (List<Offering>) restTemplate.getForObject(_URL, Object.class);
    }

    @GetMapping(AppConfig.OFFERINGS + "/{offeringId}")
    @PreAuthorize("hasRole('ROLE_ADMIN') or hasRole('ROLE_CLIENT')")
    @ApiResponses(value = {//
            @ApiResponse(code = 400, message = "Something went wrong"), //
            @ApiResponse(code = 403, message = "Access denied"), //
            @ApiResponse(code = 500, message = "Expired or invalid JWT token")})
    public Offering getOfferingById(@PathVariable Long offeringId) {
        return (Offering) restTemplate.getForObject(_URL + offeringId, Object.class);
    }

    @PostMapping(AppConfig.OFFERINGS)
    @PreAuthorize("hasRole('ROLE_ADMIN') or hasRole('ROLE_CLIENT')")
    @ApiResponses(value = {//
            @ApiResponse(code = 400, message = "Something went wrong"), //
            @ApiResponse(code = 403, message = "Access denied"), //
            @ApiResponse(code = 500, message = "Expired or invalid JWT token")})
    public Offering addOffering(@RequestBody Offering offering) {
        return (Offering) restTemplate.postForObject(_URL, offering, Object.class);
    }

    @PutMapping(AppConfig.OFFERINGS)
    @PreAuthorize("hasRole('ROLE_ADMIN') or hasRole('ROLE_CLIENT')")
    @ApiResponses(value = {//
            @ApiResponse(code = 400, message = "Something went wrong"), //
            @ApiResponse(code = 403, message = "Access denied"), //
            @ApiResponse(code = 500, message = "Expired or invalid JWT token")})
    public Offering updateOffering(@RequestBody Offering offering) {
        return (Offering) restTemplate.postForObject(_URL, offering, Object.class);
    }

    @DeleteMapping(AppConfig.OFFERINGS + "/{offeringId}")
    @PreAuthorize("hasRole('ROLE_ADMIN') or hasRole('ROLE_CLIENT')")
    @ApiResponses(value = {//
            @ApiResponse(code = 400, message = "Something went wrong"), //
            @ApiResponse(code = 403, message = "Access denied"), //
            @ApiResponse(code = 500, message = "Expired or invalid JWT token")})
    public void delete(@PathVariable Long offeringId) {
        restTemplate.delete(_URLS + offeringId);
    }


}
