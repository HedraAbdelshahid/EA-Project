package CS544.finalProject.backEnd.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.OneToOne;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Faculty extends Person {


    private String title;

    @OneToOne(mappedBy = "faculty")
    private Section section;

    public Faculty(String email, String name, String title) {
        super(email, name);
        this.title = title;
    }
}
