package murraco.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Course Code Cannot be Blank")
//    @Column(unique = true)
    private String code;

    @NotBlank(message = "Course Name Cannot be Blank")
//    @Column(unique = true)
    private String courseName;

    @NonNull
    @Size(max = 2000, message = "Description Length must be less than 2000")
    private String description;

    public Course(String code, String courseName, String description) {
        this.code = code;
        this.courseName = courseName;
        this.description = description;
    }
}
