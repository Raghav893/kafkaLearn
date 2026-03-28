package com.raghav.consumerapp;


import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

    private final KafkaTemplate<String,Course> kafkaTemplate;

    public CourseService(KafkaTemplate<String, Course> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }
    public String sendMessage(Course course){
        kafkaTemplate.send("raghav","course",course);
        return "Course message sent to kafka server";
    }
}
