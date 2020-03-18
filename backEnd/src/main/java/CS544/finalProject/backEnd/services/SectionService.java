package CS544.finalProject.backEnd.services;

import CS544.finalProject.backEnd.models.Section;
import org.springframework.stereotype.Service;

import java.util.List;

public interface SectionService {

    Section save(Section section);

    Section update(Section section);

    void delete(Section section);

    List<Section> findAll();

    Section findById(Long id);
}
