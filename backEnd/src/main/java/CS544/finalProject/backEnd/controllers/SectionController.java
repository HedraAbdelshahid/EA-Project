package CS544.finalProject.backEnd.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import CS544.finalProject.backEnd.models.Section;
import CS544.finalProject.backEnd.services.SectionService;

@RestController
public class SectionController {
	@Autowired
	private SectionService sectionService;

	@GetMapping(value = "/sections")
	public List<Section> getAllSections() {
		return sectionService.findAll();
	}

	@PostMapping(value = "/Sections/{sectionId}")
	public Section updateSection(@PathVariable Long sectionId, Section sectionDetail) {

		return sectionService.update(sectionId, sectionDetail);

	}

	@DeleteMapping(value = "/sections/delete/{sectionId}")
	public void deleteSection(@PathVariable Long sectionId) throws Throwable {
		sectionService.delete(sectionId);

	}
//	public addSection 
	
	

}
