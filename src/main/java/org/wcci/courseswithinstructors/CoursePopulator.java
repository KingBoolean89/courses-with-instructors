package org.wcci.courseswithinstructors;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;
import org.wcci.courseswithinstructors.model.CourseTopic;
import org.wcci.courseswithinstructors.model.Instructors;
import org.wcci.courseswithinstructors.repository.CourseTopicRepository;
import org.wcci.courseswithinstructors.repository.InstructorRepository;

@Service
public class CoursePopulator implements CommandLineRunner {

	@Resource
	CourseTopicRepository courseRepo;

	@Resource
	InstructorRepository instructorRepo;

	@Override
	public void run(String... args) throws Exception {

		Instructors brian = instructorRepo.save(new Instructors("Brian", "Forsythe"));
		Instructors donny = instructorRepo.save(new Instructors("Donny", "Hamilton"));
		Instructors alan = instructorRepo.save(new Instructors("Alan", "Kostrick"));

		courseRepo.save(new CourseTopic("Spring", brian));
		courseRepo.save(new CourseTopic("HTML", donny));
		courseRepo.save(new CourseTopic("JavaScript", donny));
		courseRepo.save(new CourseTopic("Java", alan));

	}

}
