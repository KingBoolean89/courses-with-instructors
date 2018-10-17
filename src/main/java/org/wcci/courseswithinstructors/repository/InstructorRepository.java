package org.wcci.courseswithinstructors.repository;

import org.springframework.data.repository.CrudRepository;
import org.wcci.courseswithinstructors.model.Instructors;

public interface InstructorRepository extends CrudRepository<Instructors, Long> {

}
