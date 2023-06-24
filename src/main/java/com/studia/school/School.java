package com.studia.school;


import com.studia.student.Student;
import java.util.*;

/**
 * Klasa reprezentująca obiekt szkoły.
 */
public class School {

    private String name;
    private List<Student> studentList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public School(String name, List<Student> studentList) {
        this.name = name;
        this.studentList = studentList;
    }
}
