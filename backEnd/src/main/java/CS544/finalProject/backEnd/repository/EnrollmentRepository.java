package CS544.finalProject.backEnd.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import CS544.finalProject.backEnd.models.Enrollment;

public interface EnrollmentRepository extends JpaRepository<Enrollment, Long>{

}
