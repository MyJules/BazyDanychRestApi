package com.rest.SpringBackend;

import com.rest.SpringBackend.exceptions.CourseNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {
    private final CoursesRepository repository;

    CourseController(CoursesRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/courses")
    List<Course> all(){
        return repository.findAll();
    }

    @GetMapping("/courses/{id}")
    Course one(@PathVariable Integer id) {
        return repository.findById(id)
                .orElseThrow(() -> new CourseNotFoundException(id));
    }
}
