/**
 * 
 */
package model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 * @author FSS Halty
 *trida reprezentujici prihlasku na termin
 */
@Entity
public class Application implements Serializable {
	
	@Id
	@GeneratedValue 
	private int id; 
	
	@NotNull
	private Customer customer;
	
	@NotNull
	private int termId;
}
