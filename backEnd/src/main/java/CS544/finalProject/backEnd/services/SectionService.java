package CS544.finalProject.backEnd.services;

import CS544.finalProject.backEnd.models.Section;

import org.springframework.http.ResponseEntity;

import java.util.List;

public interface SectionService {

    Section save(Section section);


    List<Section> findAll();

    Section findById(Long id);

	Section update(Long id, Section section);


	ResponseEntity<Void> delete(Long Id) throws Throwable;
}
