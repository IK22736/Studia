package com.studia.student;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

class GradeBookTest {

    @org.junit.jupiter.api.Test
    void addGradeToGradeBook() {
        // given
        Student student = new Student();
        student.setName("Igor");

        GradeBook gradeBook = new GradeBook();
        gradeBook.setStudent(student);
        gradeBook.setGradeList(new ArrayList<>());

        Grade grade = new Grade();
        grade.setGrade(5);
        grade.setSubject("Matematyka");

        // when
        gradeBook.addGradeToGradeBook(grade,gradeBook);

        // then
        assertEquals(gradeBook.getGradeList().size(),1);
        assertEquals(gradeBook.getGradeList().get(0).getGrade(),5);
    }
}