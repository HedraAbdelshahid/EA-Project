package murraco.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import murraco.configuration.AppConfig;
import murraco.model.Enrollment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Api(tags = "person")
public class PersonController {

    @Autowired
    private RestTemplate restTemplate;
    
    @PutMapping(value = AppConfig.ENROLLMENT + "/{enrollId}")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @ApiResponses(value = {//
            @ApiResponse(code = 400, message = "Something went wrong"), //
            @ApiResponse(code = 403, message = "Access denied"), //
            @ApiResponse(code = 500, message = "Expired or invalid JWT token")})
    public Enrollment updateEnrollment(@PathVariable Long enrollId, @RequestBody Enrollment enrollment) throws Throwable {
        return (Enrollment) restTemplate.postForObject(AppConfig.MICROSERVICE_URL + "/updateenrollment/" + enrollId, enrollment, Object.class);
    }

}
