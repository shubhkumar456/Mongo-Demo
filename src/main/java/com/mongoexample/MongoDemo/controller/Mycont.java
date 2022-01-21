package com.mongoexample.MongoDemo.controller;

import com.mongoexample.MongoDemo.mode.Student;
import com.mongoexample.MongoDemo.repo.Stdrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class Mycont {

    @Autowired
    private Stdrepo stdrepo;

    @PostMapping("/")
    public ResponseEntity<?> addstudent(@RequestBody Student students){
        Student save =this.stdrepo.save(students);
        return ResponseEntity.ok(save);

    }

    @GetMapping("/")
    public ResponseEntity<?> getstd(){
        return ResponseEntity.ok(this.stdrepo.findAll());
    }
}
