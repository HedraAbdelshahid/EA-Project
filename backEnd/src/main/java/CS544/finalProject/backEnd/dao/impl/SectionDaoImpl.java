package CS544.finalProject.backEnd.dao.impl;

import CS544.finalProject.backEnd.dao.SectionDao;
import CS544.finalProject.backEnd.models.Section;
import CS544.finalProject.backEnd.repository.SectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
@Transactional(propagation = Propagation.MANDATORY)
public class SectionDaoImpl implements SectionDao {

	@Autowired
	private SectionRepository sectionRepository;

	@Override
	public Section save(Section section) {
		return sectionRepository.save(section);
	}

	@Override
	public Section update(Section section) {
		return sectionRepository.save(section);
	}

	@Override
	public void delete(Section section) {
		sectionRepository.delete(section);

	}

	@Override
	public Section findById(Long id) {
		return sectionRepository.findById(id).get();
	}

	@Override
	public List<Section> findAll() {
		return sectionRepository.findAll();
	}
}
