package CS544.finalProject.backEnd.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import CS544.finalProject.backEnd.models.Student;

public interface  StudentRepository extends JpaRepository<Student, Long>{

}
