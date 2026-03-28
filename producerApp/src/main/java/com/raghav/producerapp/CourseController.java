package com.raghav.producerapp;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/kafka")
public class CourseController {

    private final CourseService service;

    public CourseController(CourseService service) {
        this.service = service;
    }
    @PostMapping("/add-course")
    public ResponseEntity<String> addCourse(@RequestBody Course course)
    {
        String response=service.sendMessage(course);
        return ResponseEntity.ok(response);
    }

}
