package CS544.finalProject.backEnd.services.impl;

import CS544.finalProject.backEnd.dao.EntryDao;
import CS544.finalProject.backEnd.models.Entry;
import CS544.finalProject.backEnd.services.EntryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Date;
import java.util.List;

@Service
public class EntryServiceImpl implements EntryService {

	@Autowired
	private EntryDao entryDao;

	@Override
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public Entry save(Entry entry) {
		return entryDao.save(null);
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public Entry update(Long Id, @RequestBody Entry entryDetails) throws Throwable {
		Entry entry = entryDao.findById(Id);
		entry.setEndDate(entryDetails.getEndDate());
		entry.setName(entryDetails.getName());
		entry.setStartDate(entryDetails.getStartDate());
		entry.setStudents(entryDetails.getStudents());
		final Entry updated_entry = entryDao.save(entry);

		return updated_entry;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void delete(Long Id) throws Throwable {
		Entry tobedeleted = entryDao.findById(Id);
		entryDao.delete(tobedeleted);

	}

	@Override
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public List<Entry> findAll() {
		return entryDao.findAll();
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public Entry findById(Long id) {

		return entryDao.findById(id);
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public boolean checkEnrolmentDate(Long entryId) {
		Entry entry = entryDao.findById(entryId);

		Date entrolmentStartDate = entry.getStartDate();
		Date enrolmentEndDate = entry.getEndDate();
		int startDate = new Date().compareTo(entrolmentStartDate);
		int endDate = new Date().compareTo(enrolmentEndDate);
		if (startDate >= 0 && endDate <= 0) {
			return true;
		} else {
			return false;
		}

	}
}
