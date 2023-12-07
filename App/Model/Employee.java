package com.SpringBootHibernateMySQLCRUDRESTAPI.App.Model;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "EMP_Table",
        uniqueConstraints = @UniqueConstraint (
                name = "unique_Email", columnNames = "Email" )

)

@NoArgsConstructor
@AllArgsConstructor(staticName = "build")
public class Employee {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private long id;
    @Column(name = "FName", nullable = false)
    private String firstName;
    @Column(name = "LName", nullable = false)
    private String lastName;
    @Column(name = "Email", nullable = false)

    private String email;
    @Column(name = "Age", nullable = false)
    private int age;
    @Column(name = "Gender", nullable = false)
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @Column(name = "Employee_Type", nullable = false)
    @Enumerated(EnumType.STRING)
    private EMPType empType;
    @Column(name = "Employee_Salary", nullable = false)
    private double salary;

    @Column(name = "Employee_Mobile_Number", nullable = false)
    private String mobileNumber;



}
