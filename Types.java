package entities;
// Generated 24 mai 2020 05:58:50 by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Types generated by hbm2java
 */
@Entity
@Table(name = "types", catalog = "bookall")
public class Types implements java.io.Serializable {

	private long id;
	private String name;
	private PayementTypes payementTypes;

	public Types() {
	}

	public Types(long id, String name) {
		this.id = id;
		this.name = name;
	}

	public Types(long id, String name, PayementTypes payementTypes) {
		this.id = id;
		this.name = name;
		this.payementTypes = payementTypes;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "name", nullable = false, length = 20)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "types")
	public PayementTypes getPayementTypes() {
		return this.payementTypes;
	}

	public void setPayementTypes(PayementTypes payementTypes) {
		this.payementTypes = payementTypes;
	}

}