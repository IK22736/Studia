package com.studia.student;

import com.studia.student.Student;

/**
 * Klasa reprezentująca obiekt oceny.
 */
public class Grade {

    /**
     * Pole opicujące przedmiot.
     */
    private String subject;
    /**
     * Pole opisujące ocene.
     */
    private Integer grade;

    public Grade() {
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }
}
