package murraco.model;
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
public class Offering {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String code;

    @OneToOne(cascade = CascadeType.PERSIST, orphanRemoval = true)
    private Course course;

    @OneToMany(cascade = CascadeType.PERSIST, orphanRemoval = true)
    private List<Block> block;

    public Offering(String code) {
        this.code = code;
    }
}
