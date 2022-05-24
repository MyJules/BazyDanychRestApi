package com.rest.SpringBackend;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String courseName;
    private Integer price;
    private String professorName;
    private Integer startTime;
    private Integer endTime;

    public Course(){}

    public Course(String courseName, Integer price, String professorName, Integer startTime, Integer endTime) {
        this.courseName = courseName;
        this.price = price;
        this.professorName = professorName;
        this.startTime = startTime;
        this.endTime = endTime;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Course))
            return false;
        Course employee = (Course) o;
        return Objects.equals(this.id, employee.id) &&
                Objects.equals(this.courseName, employee.courseName) &&
                Objects.equals(this.professorName, employee.professorName) &&
                Objects.equals(this.startTime, employee.startTime) &&
                Objects.equals(this.endTime, employee.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, courseName, price, professorName, startTime, endTime);
    }

    @Override
    public String toString() {
        return "Courses{" + "id=" + id +
                ", courseName='" + courseName + '\'' +
                ",price=" + price +
                ", professorName='" + professorName + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                "}";
    }
}
