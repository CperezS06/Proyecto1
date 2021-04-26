package com.ks.example.spring.repositorio;

import com.ks.example.spring.modelo.Alumno;
import org.springframework.data.repository.CrudRepository;

public interface AlumnoRepo extends CrudRepository<Alumno, Integer>
{
}
