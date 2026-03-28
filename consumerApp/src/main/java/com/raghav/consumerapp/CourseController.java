package com.raghav.consumerapp;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/kafka")
public class CourseController {

    private final CourseService service;

    public CourseController(CourseService service) {
        this.service = service;
    }
    @GetMapping("/get-course")
    public ResponseEntity<String> addCourse()
    {
        String message = service.getMessage();
        return ResponseEntity.ok(message);
    }

}
