package CS544.finalProject.backEnd.dao.impl;

import CS544.finalProject.backEnd.dao.EnrollmentDao;
import CS544.finalProject.backEnd.models.Enrollment;
import CS544.finalProject.backEnd.repository.EnrollmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
@Transactional(propagation = Propagation.MANDATORY)
public class EnrollmentDaoImpl implements EnrollmentDao {
	@Autowired
	private EnrollmentRepository enrollmentRepository;

	@Override
	public Enrollment save(Enrollment enrollment) {

		return enrollmentRepository.save(enrollment);
	}

	@Override
	public Enrollment update(Enrollment enrollemnt) {
		return enrollmentRepository.save(enrollemnt);
	}

	@Override
	public void delete(Enrollment enrollement) {
		enrollmentRepository.delete(enrollement);

	}

	@Override
	public List<Enrollment> findAll() {
		return enrollmentRepository.findAll();
	}

	@Override
	public Enrollment findById(Long id) {
		return enrollmentRepository.findById(id).get();
	}

}
