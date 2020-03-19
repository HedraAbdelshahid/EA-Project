package CS544.finalProject.backEnd.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import CS544.finalProject.backEnd.models.Entry;
import CS544.finalProject.backEnd.services.EntryService;

@RestController
public class EntryController {
	@Autowired
	private EntryService entryService;

	@GetMapping("/entries")
	public List<Entry> getAll() throws Throwable {

		return entryService.findAll();
	}

	@PutMapping("/entries/{entryId}")
	public Entry updateStudent(@PathVariable long entryId, @RequestBody Entry entryDetails) throws Throwable {
		return entryService.update(entryId, entryDetails);
	}

	@DeleteMapping("/entries/{entryId}")
	public ResponseEntity<Void> deleteEntry(@PathVariable long entrytId) throws Throwable {
		return entryService.delete(entrytId);
	}

	@PostMapping(value = "/entries")
	public Entry addEntry(@RequestBody Entry entry) {
		return entryService.save(entry);
	}

}
