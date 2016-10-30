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
import javax.validation.constraints.Null;

/**
 * @author FSS Halty
 * trida reprezentujici termin aktivity
 */
@Entity
public class Term implements Serializable {
	@Id
	@GeneratedValue 
	private int id; 
	
	@NotNull	
	private Date start;
	
	@NotNull	
	private Date end;
	
	@NotNull
	private int capacity;
	
	@NotNull
	private int trainerId;
	
	@NotNull
	private int roomId;
	
	@NotNull
	private int activityId;
	
}
