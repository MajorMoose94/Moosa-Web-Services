package com.example.demo.API;

import com.example.demo.Model.Student;
import com.example.demo.Service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class StudentController {

    @GetMapping("/student")
    public List<Student> getFullStudentList(){
        StudentService service = new StudentService();
        return service.getAllStudents();
    }

    @GetMapping("/student/{id}")
    public Student getStudentList(@PathVariable int id){
        StudentService service = new StudentService();
        List<Student> students = service.getAllStudents();

        for (Student s : students){
            if (s.getId() == id){
                return s;
            }
        }
        return null;
    }

    @PostMapping("/newStudent")
    public String newStudent(@RequestBody Student student){
        System.out.println(student);
        return "Person is created";
    }
}
