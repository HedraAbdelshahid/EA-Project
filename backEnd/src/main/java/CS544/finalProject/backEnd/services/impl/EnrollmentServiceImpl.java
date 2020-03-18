package CS544.finalProject.backEnd.services.impl;

import java.util.Date;
import java.util.List;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import CS544.finalProject.backEnd.dao.EnrollmentDao;
import CS544.finalProject.backEnd.dao.SectionDao;
import CS544.finalProject.backEnd.dao.StudentDao;
import CS544.finalProject.backEnd.models.Enrollment;
import CS544.finalProject.backEnd.models.Section;
import CS544.finalProject.backEnd.models.Student;
import CS544.finalProject.backEnd.services.EnrollmentService;
import CS544.finalProject.backEnd.services.EntryService;

@Service
public class EnrollmentServiceImpl implements EnrollmentService {
	@Autowired
	private EnrollmentDao enrollmentDao;
	@Autowired
	StudentDao studentDao;
	@Autowired
	SectionDao sectionDao;
	@Autowired
	private EntryService entryService;

	@Override
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public Enrollment save(Enrollment enrollment) {
		return enrollmentDao.save(enrollment);
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public Enrollment update(Long Id, @RequestBody Enrollment enrollmentDetais) throws Throwable {
		Enrollment enrollmentToBeUpdated = (Enrollment) enrollmentDao.findById(Id);
		enrollmentToBeUpdated.setEnrollmentDate(enrollmentDetais.getEnrollmentDate());
		final Enrollment updatedEnrollment = enrollmentDao.save(enrollmentToBeUpdated);
		return updatedEnrollment;

	}

	@Override
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public ResponseEntity<Void> delete(Long Id) throws Throwable {
		Enrollment enrollmentToBeDeleted = enrollmentDao.findById(Id);
		enrollmentDao.delete(enrollmentToBeDeleted);
		return ResponseEntity.noContent().build();

	}

	@Override
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public List<Enrollment> findAll() {
		return enrollmentDao.findAll();
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public Enrollment findById(Long id) {
		return enrollmentDao.findById(id);
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public List<Enrollment> makeEnrollment(List<Enrollment> enrollments) {
		enrollments.forEach(enrollment -> enrollmentDao.save(enrollment));
		return enrollmentDao.findAll();
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void enrol(Long studentId, Long sectionId) {

		Student studentToEnroll = studentDao.findById(studentId);
		Section sectionEnrolledIn = sectionDao.findById(sectionId);
		if (entryService.checkEnrolmentDate(studentToEnroll)) {
			Enrollment enrollment = new Enrollment(new Date());
			enrollment.setSection(sectionEnrolledIn);
			enrollment.setStudent(studentToEnroll);
			enrollmentDao.save(enrollment);

		}

	}

}