/**
 * 
 */
package model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author FSS Halty
 *trida reprezentujici mistnost
 */
@Entity
public class Room implements Serializable {
	@Id
	@GeneratedValue 
	private int id; 
	
	@NotNull
	@Size(min=2)
	private String name;
	
	@NotNull
	@Size(min=20)
	private int maxCapacity;
	
	@NotNull
	@Size(min=20)
	private String description;
	
}
