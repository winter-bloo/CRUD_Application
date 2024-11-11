package com;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping
    public ResponseEntity<Student> saveStudent(@RequestBody Student student){
        return new ResponseEntity<Student>(studentService.saveStudent(student), HttpStatus.CREATED);
    }

    @GetMapping
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping("(id)")
    public ResponseEntity<Student> getStudentById(@PathVariable("id") long studentId){
        return new ResponseEntity<Student>(studentService.getStudentById(studentId),HttpStatus.OK);
    }

    @DeleteMapping("(id)")
    public ResponseEntity<String> deleteStudent(@PathVariable("id") long id){
        studentService.deleteStudent(id);
        return new ResponseEntity<String>("Student deleted successfully.", HttpStatus.OK);
    }
}
