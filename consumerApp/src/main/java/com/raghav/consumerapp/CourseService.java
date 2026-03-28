package com.raghav.consumerapp;


import lombok.Data;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@Data
public class CourseService {

    private String message;
    @KafkaListener(topics = "raghav",groupId = "consumerG")
    public void consume(Course course){
        message = course+"GOt it from kafka ";
        System.out.println(message);

    return ;}
}
