package com.humber.eap.falgunassignment2.Controllers;

import com.humber.eap.falgunassignment2.Repositories.StudentRepository;
import com.humber.eap.falgunassignment2.models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {

    StudentRepository studentRepository;

    @Autowired
    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping("/students")
    public ResponseEntity<List<Student>> getAllStudents() {
        return ResponseEntity.ok((List<Student>) studentRepository.findAll());
    }

    @PostMapping("/students")
    public ResponseEntity addStudent(@RequestBody Student student) {
        System.out.println(student);
        studentRepository.save(student);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/students/{id}")
    public ResponseEntity deleteStudent(@PathVariable int id) {
        studentRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/students/{id}")
    public ResponseEntity updateStudent(@PathVariable int id, @RequestBody Student student) {
        student.setId(id);
        studentRepository.save(student);
        return ResponseEntity.ok().build();
    }
}
