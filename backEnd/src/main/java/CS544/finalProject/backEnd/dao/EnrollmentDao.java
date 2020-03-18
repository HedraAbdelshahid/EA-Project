package CS544.finalProject.backEnd.dao;

import java.util.List;

import CS544.finalProject.backEnd.models.Enrollment;

public interface EnrollmentDao {
	Enrollment save(Enrollment enrollment);

	Enrollment update(Enrollment enrollemnt);

	void delete(Enrollment enrollement);

	Enrollment findById(Long id);

	List<Enrollment> findAll();

}
