package CS544.finalProject.backEnd.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Block {

    @Id
    @GeneratedValue
    private Long id;
    private String code;
    private String name;
    private String semester;
    private int blockSequence;
    @Temporal(TemporalType.DATE)
    private Date startDate;
    @Temporal(TemporalType.DATE)
    private Date endDate;


    public Block(String code, String name, String semester, int blockSequence, Date startDate, Date endDate) {
        this.code = code;
        this.name = name;
        this.semester = semester;
        this.blockSequence = blockSequence;
        this.startDate = startDate;
        this.endDate = endDate;
    }
}
