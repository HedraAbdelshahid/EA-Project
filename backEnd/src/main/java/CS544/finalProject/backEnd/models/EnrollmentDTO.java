package CS544.finalProject.backEnd.models;

import java.util.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class EnrollmentDTO {

	Long id;
	private Long sectionID;

	private Long studentID;

	private Date enrollmentDate;

}
