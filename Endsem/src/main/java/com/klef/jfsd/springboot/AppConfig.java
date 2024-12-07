package com.klef.jfsd.springboot;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan(basePackages = "com.klef.jfsd.springboot") 
public class AppConfig {

    @Bean
    public Employee employee() {
        return new Employee(101, "John Doe", 75000.0, "IT", 
                Arrays.asList("Java", "Spring", "React"));
    }

    @Bean
    public Instructor instructor() {
        Instructor instructor = new Instructor();
        instructor.setInstructorId(1);
        instructor.setName("Dr. Smith");
        instructor.setEmail("smith@example.com");
        instructor.setPhoneNumber("9876543210");
        return instructor;
    }

    @Bean
    public Course course(Instructor instructor) {
        Course course = new Course();
        course.setCourseId(5001);
        course.setCourseName("Data Science");
        course.setCredits(4);
        course.setInstructor(instructor);
        return course;
    }
}

