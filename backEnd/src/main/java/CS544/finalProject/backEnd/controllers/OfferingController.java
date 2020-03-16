package CS544.finalProject.backEnd.controllers;

import CS544.finalProject.backEnd.services.OfferingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OfferingController {
    @Autowired
    private OfferingService offeringService;
}
