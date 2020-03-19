package CS544.finalProject.backEnd.repository;

import CS544.finalProject.backEnd.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
		