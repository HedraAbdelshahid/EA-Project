package murraco.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Arrays;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class StudentSectionDTO {

    private Long studentId;
    private List<Long> SectionIds;
    ;

}
