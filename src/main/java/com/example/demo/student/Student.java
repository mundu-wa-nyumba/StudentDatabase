package com.example.demo.student;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table
public class Student {

    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )

    @Id
    private Long id;
    private String name;
    private Integer age;
    private LocalDate birthday;
    private String email;

    public Student(String name, Integer age, LocalDate birthday, String email) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
        this.email = email;
    }

}
