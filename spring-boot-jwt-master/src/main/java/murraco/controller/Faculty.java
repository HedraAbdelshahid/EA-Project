/*
package murraco.controller;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import murraco.model.Person;
import murraco.model.Section;

import javax.persistence.Entity;
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
    public Section getSection(){
        return section;
    }

}
*/
