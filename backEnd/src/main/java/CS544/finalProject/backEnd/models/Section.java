package CS544.finalProject.backEnd.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Section {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @OneToOne
    private Faculty faculty;

    @ManyToOne
    private Offering offering;


    @ManyToMany(mappedBy = "sections")
    private List<Student> studentList;

    public Section(String name) {
        this.name = name;
    }


}
