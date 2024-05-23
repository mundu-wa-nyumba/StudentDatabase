package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner (StudentRepository studentRepository) {
        return args -> {
            Student Austin = new Student(
                    1L,
                    "Austo",
                    21,
                    LocalDate.of(2000, Month.APRIL, 19),
                    "Austin@blahh.com"

            );

            Student Abdalla = new Student(
                    "Abdalla",
                    21,
                    LocalDate.of(2000, Month.JULY, 20),
                    "Abdalla@blah.com"

            );

            studentRepository.saveAll(List.of(Austin, Abdalla));
        };
    }
}
