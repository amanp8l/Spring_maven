package com.example.spring_maven;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;

@RestController
public class StudentControler {
    @Autowired
    StudentService studentService;

    //get information
    @GetMapping("/get_student")
    public ResponseEntity getStudent(@RequestParam("admitnNo") int admitnNo){
        Student student=studentService.getStudent(admitnNo);
        return new ResponseEntity<>(student, HttpStatus.FOUND) ;
    }

    //adding information
    @PostMapping("/add_student")
    public ResponseEntity addStudent(@RequestBody Student student){
        String response=studentService.addStudent(student);
        return new ResponseEntity<>(response,HttpStatus.CREATED);
    }
    @DeleteMapping("/delete_student/{id}")
    public ResponseEntity  deleteStudent(@PathVariable("id") int id){
        String response = studentService.deleteStudent(id);
        if(response.equals("invalid id"))
            return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(response, HttpStatus.FOUND);
    }
    @PutMapping("/update_student")
    public ResponseEntity updateStudent(@RequestParam("id") int id, @RequestParam("age") int age){
        String response= studentService.updateStudent(id,age);
        if(response==null)
            return new ResponseEntity<>("invalid id", HttpStatus.BAD_REQUEST);
        return new ResponseEntity<>(response, HttpStatus.ACCEPTED);
    }

}
