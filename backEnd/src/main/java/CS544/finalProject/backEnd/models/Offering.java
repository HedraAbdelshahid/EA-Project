package CS544.finalProject.backEnd.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Offering {

    @Id
    @GeneratedValue
    private Long id;

    private String code;

    @OneToOne
    private Course course;

    @OneToMany
    private Block block;

    public Offering(String code) {
        this.code = code;
    }
}
