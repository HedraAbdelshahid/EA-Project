package CS544.finalProject.backEnd.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Enrollment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @ManyToOne
    @JoinColumn(name = "section_id")
    private Section section;
    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;
    @Temporal(TemporalType.DATE)
    private Date enrollmentDate;

    public Enrollment(Date enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

}
