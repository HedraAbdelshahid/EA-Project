package CS544.finalProject.backEnd.dao.impl;

import CS544.finalProject.backEnd.dao.EntryDao;
import CS544.finalProject.backEnd.models.Entry;
import CS544.finalProject.backEnd.repository.EntryRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EntryDaoImpl implements EntryDao {

    @Autowired
    EntryRepository entryRepository;

    @Override
    public Entry save(Entry entry) {
        return null;
    }

    @Override
    public Entry update(Entry entry) {
        return null;
    }

    @Override
    public void delete(Entry entry) {

    }

    @Override
    public List<Entry> findAll(Entry entry) {
        return null;
    }

    @Override
    public Entry findById(Long id) {
        return null;
    }
}
