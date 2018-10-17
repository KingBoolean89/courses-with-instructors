package org.wcci.courseswithinstructors.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Instructors {

	@Id
	@GeneratedValue
	private Long id;
	private String firstName;
	private String lastName;
	@OneToMany(mappedBy = "instructors")
	private List<CourseTopic> courseTopic = new ArrayList<>();

	public Instructors() {
	}

	public Instructors(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Long getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	@Override
	public String toString() {
		return id + ") " + firstName + " " + lastName;
	}

}
