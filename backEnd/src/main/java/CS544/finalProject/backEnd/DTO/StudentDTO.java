package CS544.finalProject.backEnd.DTO;

import java.util.List;

import CS544.finalProject.backEnd.models.Enrollment;
import CS544.finalProject.backEnd.models.Entry;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor

public class StudentDTO {

	private Long studentId;
	private String email;
	private String name;
	private Entry entry;
	private List<Enrollment> enrollments;

}
