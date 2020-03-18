package CS544.finalProject.backEnd.repository;

import CS544.finalProject.backEnd.models.Enrollment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnrollmentRepository extends JpaRepository<Enrollment, Long>{

}
