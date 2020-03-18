package CS544.finalProject.backEnd.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Enrollment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	@ManyToOne
	@JoinColumn(name ="section_id")
	private Section section;
	@ManyToOne
	@JoinColumn(name ="student_id")
	private Student student;
	@Temporal(TemporalType.DATE)
	private Date enrollmentDate;
         
	public Enrollment(Date enrollmentDate) {
		this.enrollmentDate = enrollmentDate;
	}

}
