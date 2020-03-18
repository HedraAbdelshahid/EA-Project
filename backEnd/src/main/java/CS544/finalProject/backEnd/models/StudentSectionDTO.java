package CS544.finalProject.backEnd.models;

import java.util.List;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class StudentSectionDTO {

	private Long studentId;
	private List<Long> SectionIds;

}
