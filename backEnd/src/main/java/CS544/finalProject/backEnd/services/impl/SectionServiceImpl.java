package CS544.finalProject.backEnd.services.impl;

import CS544.finalProject.backEnd.dao.SectionDao;
import CS544.finalProject.backEnd.models.Section;
import CS544.finalProject.backEnd.services.SectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SectionServiceImpl implements SectionService {

	@Autowired
	private SectionDao sectionDao;

	@Override
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public Section save(Section section) {
		return sectionDao.save(section);
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public Section update(Long sectionId, Section sectionDetails) {

		Section section = (Section) sectionDao.findById(sectionId);

		section.setFaculty(sectionDetails.getFaculty());
		section.setName(sectionDetails.getName());
		section.setOffering(sectionDetails.getOffering());

		final Section updatedSection = sectionDao.save(section);
		return updatedSection;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public ResponseEntity<Void> delete(Long Id) throws Throwable {
		Section sectionToBeDeleted = sectionDao.findById(Id);
		sectionDao.delete(sectionToBeDeleted);
		return ResponseEntity.noContent().build();
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public List<Section> findAll() {
		return sectionDao.findAll();
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public Section findById(Long id) {
		return sectionDao.findById(id);
	}
}
