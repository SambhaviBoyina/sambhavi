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
@Table(name="project_master")
public class Project {
@Id
@Column(name="project_id")
private int pid;
private String duration;

@ManyToMany(fetch=FetchType.LAZY,mappedBy="projects")
private Set<Employee> empls = new HashSet<>();




public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getDuration() {
	return duration;
}
public void setDuration(String duration) {
	this.duration = duration;
}
public Set<Employee> getEmpls() {
	return empls;
}
public void setEmpls(Set<Employee> empls) {
	this.empls = empls;
}




}
