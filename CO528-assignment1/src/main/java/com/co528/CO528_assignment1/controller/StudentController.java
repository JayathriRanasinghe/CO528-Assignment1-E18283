package com.co528.CO528_assignment1.controller;

import com.co528.CO528_assignment1.Student;
import com.co528.CO528_assignment1.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("students")
@CrossOrigin
public class StudentController {
    @Autowired
    StudentService studentService;
     @GetMapping("all-students")
     public List<Student> getAllStudents(){
         return studentService.getAllStudents();
     }
    @GetMapping("student/{id}")
    public Optional<Student> getStudentByID(@PathVariable Integer id){
        return studentService.getStudentByID(id);
    }
    @PostMapping("add-student")
    public String addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }
    @PutMapping("update-student/{id}")
    public String updateStudentRecord(@PathVariable Integer id, @RequestBody Student updatedRecord) {
        return studentService.updateStudentRecord(id, updatedRecord);
    }

    @DeleteMapping("delete-record/{id}")
    public String deleteStudentRecord(@PathVariable Integer id){
        return studentService.deleteStudentRecord(id);
    }

}