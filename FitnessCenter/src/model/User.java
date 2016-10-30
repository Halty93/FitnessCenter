/**
 * 
 */
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
 * tøída rprezentující uživatel, pøedek pro všechny typy uživatelù
 */
@Entity
public class User implements Serializable {
	@Id
	@GeneratedValue 
	protected int id; 
	
	@NotNull
	@Size(min=3)
	protected String name;
	
	@NotNull
	@Size(min=3)
	protected String surname;
	
	@NotNull
	@Size(min=3)
	protected String city;
	
	@NotNull
	@Size(min=3)
	protected String psc;
	
	@NotNull
	@Size(min=3)
	protected String street;	
	
	@NotNull
	@Size(min=3)
	protected String phoneNumber;
	
	@NotNull
	@Size(min=3)
	protected Date birthdate;
	
	@NotNull
	@Size(min=3)
	protected String emailAddress;

}
