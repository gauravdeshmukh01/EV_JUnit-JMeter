package org.example.Entity;

import org.example.Service.StudentService;

public class Student {

    StudentService studentService;

    public Student(StudentService studentService)
    {
        this.studentService=studentService;
    }


    public int getAverageMarks()
    {
        return studentService.getTotalMarks()/studentService.getTotalStudents();
    }


}
