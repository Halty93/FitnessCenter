
package model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author FSS Halty
 *
 */
@Entity
public class Repairman implements Serializable{
	@Id
	@GeneratedValue 
	private int id; 
	
	@NotNull
	@Size(min=3)
	private String name;
	
	@NotNull
	@Size(min=3)
	private String surname;
	
	@NotNull
	@Size(min=3)
	private String city;
	
	@NotNull
	@Size(min=3)
	private String psc;
	
	@NotNull
	@Size(min=3)
	private String street;	
	
	@NotNull
	@Size(min=3)
	private String phoneNumber;
	
	@NotNull
	@Size(min=3)
	private Date birthdate;
	
	@NotNull
	@Size(min=3)
	private String emailAddress;
}
