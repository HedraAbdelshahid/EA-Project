package CS544.finalProject.backEnd.dao.impl;

import CS544.finalProject.backEnd.dao.SectionDao;
import CS544.finalProject.backEnd.models.Section;
import CS544.finalProject.backEnd.repository.SectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SectionDaoImpl implements SectionDao {

    @Autowired
    private SectionRepository sectionRepository;

    @Override
    public Section save(Section section) {
        return null;
    }

    @Override
    public Section update(Section section) {
        return null;
    }

    @Override
    public void delete(Section section) {

    }

    @Override
    public List<Section> findAll(Section section) {
        return null;
    }

    @Override
    public Section findById(Long id) {
        return null;
    }
}
