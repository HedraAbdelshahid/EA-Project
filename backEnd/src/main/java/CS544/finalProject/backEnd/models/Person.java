package CS544.finalProject.backEnd.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@NoArgsConstructor
@Getter
@Setter
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotBlank
	private String name;
	@Email
	private String email;

	@Embedded
	@AttributeOverrides({ @AttributeOverride(name = "street", column = @Column(name = "home_street")),
			@AttributeOverride(name = "city", column = @Column(name = "home_city")),
			@AttributeOverride(name = "zip", column = @Column(name = "home_zip")),
			@AttributeOverride(name = "country", column = @Column(name = "home_country")) })
	private Address homeAddress;

	@Embedded
	@AttributeOverrides({ @AttributeOverride(name = "street", column = @Column(name = "mail_street")),
			@AttributeOverride(name = "city", column = @Column(name = "mail_city")),
			@AttributeOverride(name = "zip", column = @Column(name = "mail_zip")),
			@AttributeOverride(name = "country", column = @Column(name = "mail_country")) })
	private Address mailAddress;

	public Person(String email, String name) {
		this.email = email;
		this.name = name;
	}
}
