package CS544.finalProject.backEnd.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Student extends Person {

	private Long studentId;

	@ManyToOne(cascade = CascadeType.PERSIST)
	private Entry entry;

	@OneToMany(mappedBy = "student", fetch = FetchType.EAGER)
	private List<Enrollment> enrollments;

	public Student(String email, String name, Long studentId) {
		super(email, name);
		this.studentId = studentId;
	}

}
