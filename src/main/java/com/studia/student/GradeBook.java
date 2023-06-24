package com.studia.student;

import java.util.*;
import org.apache.log4j.Logger;

/**
 * KLasa przechowująca dziennik ocen ucznia.
 */
public class GradeBook {

    final static Logger logger = Logger.getLogger(Logger.class);

    private Student student;
    private List<Grade> gradeList;

    public GradeBook() {
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public List<Grade> getGradeList() {
        return gradeList;
    }

    public void setGradeList(List<Grade> gradeList) {
        this.gradeList = gradeList;
    }

    /**
     * Metoda pozwalająca na dodawanie ocen do dzienniku ucznia.
     *
     * @param grade ocena jaka otrzyma uczen
     * @param gradeBook dziennik ocen ucznia
     */
    public void addGradeToGradeBook(Grade grade, GradeBook gradeBook){
        logger.info("Dodaj ocene: " + grade.getGrade());
        logger.info("Uczen otrzymujacy ocene: " + gradeBook.getStudent().getName());

        List<Grade> grades = gradeBook.getGradeList();
        grades.add(grade);
        gradeBook.setGradeList(grades);
    }
}
