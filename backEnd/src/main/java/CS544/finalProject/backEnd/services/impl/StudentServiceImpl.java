package CS544.finalProject.backEnd.services.impl;

import CS544.finalProject.backEnd.dao.EnrollmentDao;
import CS544.finalProject.backEnd.dao.SectionDao;
import CS544.finalProject.backEnd.dao.StudentDao;
import CS544.finalProject.backEnd.models.Course;
import CS544.finalProject.backEnd.models.Enrollment;
import CS544.finalProject.backEnd.models.Section;
import CS544.finalProject.backEnd.models.Student;
import CS544.finalProject.backEnd.models.StudentSectionDTO;
import CS544.finalProject.backEnd.services.EnrollmentService;
import CS544.finalProject.backEnd.services.EntryService;
import CS544.finalProject.backEnd.services.SectionService;
import CS544.finalProject.backEnd.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Date;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao studentDao;
	@Autowired
	private SectionDao sectionDao;
	@Autowired
	private EnrollmentDao enrollmentDao;
	@Autowired
	private EnrollmentService enrollmentService;
	@Autowired
	private SectionService sectionService;
	@Autowired
	private EntryService entryService;

	@Override
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public Student save(Student student) {
		return studentDao.save(student);
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public Student update(long studentId, @RequestBody Student studentDetails) throws Throwable {

		Student student = (Student) studentDao.findById(studentId);
		// .orElseThrow(() -> new ResourceNotFoundException("Student not found for this
		// id : : " + studentId));

		student.setName(studentDetails.getName());
		student.setEmail(studentDetails.getEmail());
		student.setEntry(studentDetails.getEntry());

		final Student updated_student = studentDao.save(student);
		return updated_student;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public ResponseEntity<Void> delete(long studentId) throws Throwable {
		Student student = (Student) studentDao.findById(studentId);
		// .orElseThrow(() -> new ResourceNotFoundException(("Student not found for this
		// id : : " + studentId)));
		studentDao.delete(student);
		return ResponseEntity.noContent().build();
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public List<Student> findAll() {
		return studentDao.findAll();
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public Student findById(Long id) throws Throwable {
		return (Student) studentDao.findById(id);
		// .orElseThrow(() -> new ResourceNotFoundException("No Student is found the
		// required id: " + id));
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public Student enrol(@RequestBody StudentSectionDTO studentSectionDTO) throws Throwable{
		
		Long studentId = studentSectionDTO.getStudentId();
		
		studentSectionDTO.getSectionIds().forEach(s -> enrollmentService.enrol(studentId, s));

		 return findById(studentId);
		
	}

}
