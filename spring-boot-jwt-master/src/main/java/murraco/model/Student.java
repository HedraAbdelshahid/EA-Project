package murraco.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Student extends Person {

    private Long studentId;

    @ManyToOne
    private Entry entry;

    @OneToMany(mappedBy = "student", fetch = FetchType.EAGER)
    private List<Enrollment> enrollments;

    public Student(String email, String name, Long studentId) {
        super(email, name);
        this.studentId = studentId;
    }
    /*//    @GeneratedValue
    private Long studentId;

    @ManyToOne
    private Entry entry;

    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable()
    private List<Section> sections;

    public Student(String email, String name, Long studentId) {
        super(email, name);
        this.studentId = studentId;
    }*/
}
