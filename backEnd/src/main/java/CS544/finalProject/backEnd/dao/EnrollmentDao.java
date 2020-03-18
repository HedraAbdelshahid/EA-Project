package CS544.finalProject.backEnd.dao;

import CS544.finalProject.backEnd.models.Enrollment;

import java.util.List;

public interface EnrollmentDao {
	Enrollment save(Enrollment enrollment);

	Enrollment update(Enrollment enrollemnt);

	void delete(Enrollment enrollement);

	Enrollment findById(Long id);

	List<Enrollment> findAll();

}
