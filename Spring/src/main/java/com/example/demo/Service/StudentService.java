package com.example.demo.Service;

import com.example.demo.Model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentService {

    public List<Student> getAllStudents() {
        Student student1 = new Student(1, "Link", 15, 9);
        Student student2 = new Student(2, "Ganondorf", 18, 9);
        Student student3 = new Student(3, "Zelda", 11, 9);

        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        return studentList;
    }
}
