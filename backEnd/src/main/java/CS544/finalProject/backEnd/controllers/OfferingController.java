package CS544.finalProject.backEnd.controllers;

import CS544.finalProject.backEnd.config.AppConfig;
import CS544.finalProject.backEnd.exceptions.ResourceNotFoundException;
import CS544.finalProject.backEnd.models.Block;
import CS544.finalProject.backEnd.models.Course;
import CS544.finalProject.backEnd.models.Offering;
import CS544.finalProject.backEnd.services.OfferingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

@RestController
public class OfferingController {

    @Autowired
    private OfferingService offeringService;


    @GetMapping(AppConfig.OFFERINGS)
    public List<Offering> getAllOfferings() {

//        Course course = new Course("“CS544”","Enterprise Architecture","This is description");
//        List<Block> blocks = new ArrayList<>();
//        blocks.add(new Block("2020-03","“March 2020","“Spring”",1,new Date(),new Date()));
//        Offering offering = new Offering("2020");
//
//        offering.setCourse(course);
//        offering.setBlock(blocks);
//        offeringService.save(offering);

        return offeringService.findAll();
    }

//    @GetMapping(AppConfig.OFFERINGS + AppConfig.COURSES + AppConfig.BLOCKS)
//    public Collection<Offering> findOfferingsOfferingBlock() {
//        return offeringService.findOfferingsCourseBlock();
//    }

    @GetMapping(AppConfig.OFFERINGS + "/{offeringId}")
    public Offering getOfferingById(@PathVariable Long offeringId) {

        return offeringService.findById(offeringId).orElseThrow(() -> new ResourceNotFoundException("Offering Not Found"));
    }

    @PostMapping(AppConfig.OFFERINGS)
    public Offering addOffering(@RequestBody Offering offering) {
        return offeringService.save(offering);
    }

    @PutMapping(AppConfig.OFFERINGS)
    public Offering updateOffering(@RequestBody Offering offering) {
        return offeringService.update(offering);
    }

    @DeleteMapping(AppConfig.OFFERINGS + "/{offeringId}")
    public void delete(@PathVariable Long offeringId) {
        offeringService.delete(offeringId);
    }


}
