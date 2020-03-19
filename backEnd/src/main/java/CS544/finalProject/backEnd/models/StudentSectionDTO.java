package CS544.finalProject.backEnd.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class StudentSectionDTO {

	private Long studentId;
	private List<Long> SectionIds;;

}
