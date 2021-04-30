package com.ks.example.spring.repositorio;

import com.ks.example.spring.modelo.Alumno;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * This interface is used to make a repository for Alumno
 * @see Alumno
 */
public interface AlumnoRepo extends CrudRepository<Alumno, Integer>
{

    @Transactional(readOnly = true)
    @Query(value = "SELECT * FROM alumnos", nativeQuery = true)
    List<Alumno> findAll();

    @Transactional
    @Modifying
    @Query(value = "INSERT INTO alumnos(name, age, grade, calif) VALUES(?1, ?2, ?3, ?4)", nativeQuery = true)
    List<Alumno> save();

    /*@Transactional
    @Modifying
    @Query(value = "UPDATE alumnos SET calif=6 WHERE calif < 6", nativeQuery = true)
    List<Alumno> save();*/
}
