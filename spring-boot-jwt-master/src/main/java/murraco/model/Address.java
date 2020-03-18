package murraco.model;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;

@NoArgsConstructor
@Getter
@Setter
@Embeddable
public class Address {

    @NotBlank
    private String street;
    @NotBlank
    private String city;
    //    Digits(ma)
    private long zip;
    private String country;

    public Address(String street, String city, long zip, String country) {
        this.street = street;
        this.city = city;
        this.zip = zip;
        this.country = country;
    }
}
