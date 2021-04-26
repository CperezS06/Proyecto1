package com.ks.example.spring.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "alumnos")
public class Alumno
{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String name;
    private int age;
    private int grade;
    private Double calif;

    public Alumno(String name, int age, int grade, Double calif) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.calif = calif;
    }
}
