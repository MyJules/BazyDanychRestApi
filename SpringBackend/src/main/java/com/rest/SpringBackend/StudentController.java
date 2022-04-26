package com.rest.SpringBackend;

import java.util.List;

import com.rest.SpringBackend.exceptions.StudentNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    private final StudentRepository _repository;

    StudentController(StudentRepository repository){
        _repository = repository;
    }

    @GetMapping("/students")
    List<Student> allStudents(){
        return _repository.findAll();
    }

    @GetMapping("/students/{id}")
    Student student(@PathVariable Long id){
        return _repository.findById(id).orElseThrow(() -> new StudentNotFoundException(id));
    }
}