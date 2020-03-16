package CS544.finalProject.backEnd.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Student extends Person {


    //    @GeneratedValue
    private Long studentId;

    @ManyToOne
    private Entry entry;

    @ManyToMany
    @JoinTable(name = "enrollment")
    private List<Section> sections;

    public Student(String email, String name, Long studentId) {
        super(email, name);
        this.studentId = studentId;
    }
}
