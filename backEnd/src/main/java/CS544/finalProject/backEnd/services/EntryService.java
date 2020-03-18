package CS544.finalProject.backEnd.services;

import CS544.finalProject.backEnd.models.Entry;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EntryService {

    Entry save(Entry entry);

    Entry update(Entry entry);

    void delete(Entry entry);

    List<Entry> findAll();

    Entry findById(Long id);
}
