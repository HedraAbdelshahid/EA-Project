package CS544.finalProject.backEnd.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Max;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Course {

    @Id
    @GeneratedValue
    private Long id;

    @NonNull
    private String code;
    @NonNull
    private String courseName;

    @Max(2000)
    private String description;

    public Course(@NonNull String code, @NonNull String courseName, @Max(2000) String description) {
        this.code = code;
        this.courseName = courseName;
        this.description = description;
    }
}
