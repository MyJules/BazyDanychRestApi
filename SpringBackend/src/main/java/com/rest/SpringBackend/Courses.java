package com.rest.SpringBackend;

import javax.persistence.*;

@Entity
@Table(name = "Courses")
public class Courses{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String courseName;
    private Integer price;
    private String professorName;
    private Integer startTime;
    private Integer endTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCourseName() { return courseName; }

    public void setCourseName(String name) {
        this.courseName = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getProfessorName() {
        return professorName;
    }

    public void setProfessorName(String professorName) {
        this.professorName = professorName;
    }

    public Integer getStartTime() {
        return startTime;
    }

    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    public Integer getEndTime() {
        return endTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }
}
