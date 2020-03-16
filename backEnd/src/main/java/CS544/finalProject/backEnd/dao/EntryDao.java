package CS544.finalProject.backEnd.dao;

import CS544.finalProject.backEnd.models.Entry;

import java.util.List;

public interface EntryDao {

    Entry save(Entry entry);

    Entry update(Entry entry);

    void delete(Entry entry);

    List<Entry> findAll(Entry entry);

    Entry findById(Long id);
}
