package CS544.finalProject.backEnd.dao.impl;

import java.util.List;
import java.util.Optional;

import CS544.finalProject.backEnd.models.Person;
import CS544.finalProject.backEnd.models.Student;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.annotation.Propagation;
import CS544.finalProject.backEnd.dao.FacultyDao;
import CS544.finalProject.backEnd.models.Faculty;
import CS544.finalProject.backEnd.repository.FacultyRepository;

@Component
@Transactional(propagation=Propagation.REQUIRED)
public class FacultyDaoImpl implements FacultyDao{


    @Autowired
    private FacultyRepository facultyRepository;
	
	@Override
	public Faculty save(Faculty faculty) {
		 return facultyRepository.save(faculty);
	}

	@Override
	public Faculty update(Long id,Faculty faculty) {
		return facultyRepository.save(faculty);
	}

	@Override
	public void deleteById(Long id) {
		facultyRepository.deleteById(id);
	}
	@Override
	public List<Student> getStudents(Long id){
		return facultyRepository.getAllStudentFromSection(id);
	}
	@Override
	public List<Faculty> findAll() {
	return facultyRepository.findAll();
	}

	@Override
	public Faculty findById(Long id) {
		Optional<Faculty> optionalFaculty=facultyRepository.findById(id);
	    Faculty facalty = optionalFaculty.get();
	    return facalty;
	
	}

}
