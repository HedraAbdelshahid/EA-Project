package CS544.finalProject.backEnd.services;

import CS544.finalProject.backEnd.models.Entry;
import CS544.finalProject.backEnd.models.Student;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EntryService {
    Entry save(Entry entry);

    Entry update(Long Id, Entry entryDetails) throws Throwable;

    ResponseEntity<Void> delete(Long Id) throws Throwable;

    List<Entry> findAll();

    Entry findById(Long id);

    boolean checkEnrolmentDate(Student student);


}
