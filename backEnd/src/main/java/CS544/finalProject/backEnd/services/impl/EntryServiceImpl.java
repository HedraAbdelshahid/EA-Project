package CS544.finalProject.backEnd.services.impl;

import CS544.finalProject.backEnd.dao.EntryDao;
import CS544.finalProject.backEnd.models.Entry;
import CS544.finalProject.backEnd.services.EntryService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EntryServiceImpl implements EntryService {

    @Autowired
    private EntryDao entryDao;

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
    public List<Entry> findAll() {
        return null;
    }

    @Override
    public Entry findById(Long id) {
        return null;
    }
}
