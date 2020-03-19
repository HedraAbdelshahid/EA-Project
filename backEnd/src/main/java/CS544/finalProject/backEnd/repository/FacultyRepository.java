package CS544.finalProject.backEnd.repository;

import java.util.List;

import CS544.finalProject.backEnd.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import CS544.finalProject.backEnd.models.Faculty;
import CS544.finalProject.backEnd.models.Person;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface FacultyRepository extends JpaRepository<Faculty,Long>{

    @Query("select e.student from Enrollment e where e.section.id = :id")
    List<Student> findAllStudentFromEnrollment(@Param("id") Long id);
}
