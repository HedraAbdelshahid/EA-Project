package CS544.finalProject.backEnd.services.impl;

import CS544.finalProject.backEnd.dao.SectionDao;
import CS544.finalProject.backEnd.models.Section;
import CS544.finalProject.backEnd.services.SectionService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SectionServiceImpl implements SectionService {

    @Autowired
    private SectionDao sectionDao;

    @Override
    public Section save(Section section) {
        return sectionDao.save(section);
    }

    @Override
    public Section update(Section section) {
        return sectionDao.update(section);
    }

    @Override
    public void delete(Section section) {
    }

    @Override
    public List<Section> findAll() {
        return null;
    }

    @Override
    public Section findById(Long id) {
        return null;
    }
}
