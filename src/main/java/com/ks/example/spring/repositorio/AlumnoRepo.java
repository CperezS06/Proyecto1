package com.ks.example.spring.repositorio;

import com.ks.example.spring.modelo.Alumno;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface AlumnoRepo extends CrudRepository<Alumno, Integer>
{
    @Transactional(readOnly = true)
    @Query(value = "SELECT * FROM alumnos", nativeQuery = true)
    List<Alumno> findAll();
}
