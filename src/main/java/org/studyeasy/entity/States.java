package org.studyeasy.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "states", uniqueConstraints = {
		@UniqueConstraint(columnNames = {"id"})
})
public class States {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	int id;
	@Column(name = "name")
	String name;
	@Column(name = "capital")
	String capital;
	
	
	public States() {
		super();
	}
	public States(int id, String name, String capital) {
		
		this.id = id;
		this.name = name;
		this.capital = capital;
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
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	@Override
	public String toString() {
		return "States [id=" + id + ", name=" + name + ", capital=" + capital + "]";
	}
}
