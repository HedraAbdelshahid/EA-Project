package CS544.finalProject.backEnd.controllers;

import CS544.finalProject.backEnd.services.SectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SectionController {
    @Autowired
    private SectionService sectionService;
}
