package org.wcci.courseswithinstructors.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.wcci.courseswithinstructors.repository.CourseTopicRepository;
import org.wcci.courseswithinstructors.repository.InstructorRepository;

@Controller
public class CoursesController {

	@Resource
	CourseTopicRepository courseRepo;

	@Resource
	InstructorRepository instructorRepo;

	@GetMapping("/")
	public String root() {
		return "redirect:instructors";
	}

	@GetMapping("/instructors")
	public String getInstructors(Model model) {
		model.addAttribute("instructors", instructorRepo.findAll());
		return "instructors";
	}

	@GetMapping("/instructors/{id}")
	public String getInstructor(@PathVariable(value = "id") Long id, Model model) {
		model.addAttribute("instructor", instructorRepo.findById(id).get());
		return "instructor";
	}
}
