package CS544.finalProject.backEnd.dao.impl;

import CS544.finalProject.backEnd.dao.EntryDao;
import CS544.finalProject.backEnd.models.Entry;
import CS544.finalProject.backEnd.repository.EntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
@Transactional(propagation = Propagation.MANDATORY)
public class EntryDaoImpl implements EntryDao {

    @Autowired
    EntryRepository entryRepository;

    @Override
    public Entry save(Entry entry) {

        return entryRepository.save(entry);
    }

    @Override
    public Entry update(Entry entry) {
        return entryRepository.save(entry);
    }

    @Override
    public void delete(Entry entry) {
        entryRepository.delete(entry);

    }

    @Override
    public List<Entry> findAll() {
        return entryRepository.findAll();
    }

    @Override
    public Entry findById(Long id) {
        return entryRepository.findById(id).get();
    }
}