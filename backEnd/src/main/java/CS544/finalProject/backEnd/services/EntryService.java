package CS544.finalProject.backEnd.services;

import CS544.finalProject.backEnd.models.Entry;

import java.util.List;

public interface EntryService {

	Entry save(Entry entry);

	Entry update(Long Id, Entry entryDetails) throws Throwable;

	void delete(Long Id) throws Throwable;

	List<Entry> findAll();

	Entry findById(Long id);
	boolean checkEnrolmentDate(Long entryId);

}
