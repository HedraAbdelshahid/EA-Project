package CS544.finalProject.backEnd.dao;

import CS544.finalProject.backEnd.models.Section;

import java.util.List;

public interface SectionDao {

    Section save(Section section);

    Section update(Section section);

    void delete(Section section);

    List<Section> findAll();

    Section findById(Long id);
}
