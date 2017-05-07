package anax.pang.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@Table(name="registrytype")
public class RegistryType {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private int id;
	
	@Column(name = "name", nullable = false)
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String name;
	
	@Column(name = "shortname", nullable = false)
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String shortName;

	public RegistryType() {}

	public RegistryType(int id) {
		this.id = id;
	}

	public RegistryType(int id, String name, String shortName) {
		this.id = id;
		this.name = name;
		this.shortName = shortName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}	
}
