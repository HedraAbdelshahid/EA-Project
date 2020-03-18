package murraco.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Section {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToOne
    private Faculty faculty;
    @ManyToOne
    private Offering offering;


    @ManyToMany(mappedBy = "sections",cascade = CascadeType.ALL)
    private List<Student> students;

    public Section(String name) {
        this.name = name;
    }


}
