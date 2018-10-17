package org.wcci.courseswithinstructors.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class CourseTopic {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	@ManyToOne
	private Instructors instructors;

	public Instructors getInstructors() {
		return instructors;
	}

	public CourseTopic() {

	}

	public CourseTopic(String name, Instructors instructors) {
		this.name = name;
		this.instructors = instructors;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return id + ") " + name;
	}

}
