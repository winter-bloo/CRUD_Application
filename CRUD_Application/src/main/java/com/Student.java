package com;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "Students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "first Name", nullable = false)
    private String firstName;

    @Column(name = "last Name", nullable = false)
    private String lastName;

    @Column(name = "email", unique = true, nullable = false)
    private String email;

    @Column(name = "Department", nullable = false)
    private String Department;

    @Column(name = "year Of Enrollment", nullable = false)
    private String yearOfEnrollment;

}
