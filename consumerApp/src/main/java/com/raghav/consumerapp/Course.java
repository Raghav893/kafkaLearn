package com.raghav.consumerapp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Course {
    private String id;
    private String title;
    private String trainer;
    private double price;
}
