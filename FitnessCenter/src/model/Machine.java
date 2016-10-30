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
import javax.validation.constraints.Size;

/**
 * @author FSS Halty
 *trida reprezentujici stroj v posilovne
 */
@Entity
public class Machine implements Serializable {
	@Id
	@GeneratedValue 
	private int id; 
	
	@NotNull
	@Size(min=2)
	private String name;
	
	@NotNull
	private int descrition;
	
	@Null
	private int defect;
	
	@Null	
	private String statusOfDefect;
	
	@Null	
	private Date lastMaintenanceDate;
	
	@Null	
	private Date nextMaintenanceDate;
}
