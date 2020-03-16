package CS544.finalProject.backEnd.controllers;

import CS544.finalProject.backEnd.services.EntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EntryController {
    @Autowired
    private EntryService entryService;
}
