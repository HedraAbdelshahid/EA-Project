package CS544.finalProject.backEnd.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class OfferingDTO {

    private Long id;

    private String code;

    private Long courseId;

    private List<Long> blockIds;

}
