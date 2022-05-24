package com.rest.SpringBackend.exceptions;

public class CourseNotFoundException extends RuntimeException{

    public CourseNotFoundException(Integer id){
        super("Could not find course " + id);
    }
}
