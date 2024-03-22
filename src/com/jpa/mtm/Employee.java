package com.jpa.mtm;

import java.util.Date;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;





@Entity
@Table(name="empl1")

public class Employee {
	@Id
	@Column(name="emp_id")
	private int empid;
	private String name;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "start_date")
	private Date dateofjoin;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "proj_empl", joinColumns = { @JoinColumn(name = "emp_id") }, inverseJoinColumns = { @JoinColumn(name = "project_id") })
	private Set<Project> projects = new HashSet<>();
	
	

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateofjoin() {
		return dateofjoin;
	}

	public void setDateofjoin(Date dateofjoin) {
		this.dateofjoin = dateofjoin;
	}
	
	public Set<Project> getProjects() {
		return projects;
	}

	public void setProjects(Set<Project> projects) {
		this.projects = projects;
	}
	public void addProjects(Project project) {
		this.getProjects().add(project);
	}

	


}
