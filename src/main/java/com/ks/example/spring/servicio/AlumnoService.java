package com.ks.example.spring.servicio;

import com.ks.example.spring.modelo.Alumno;
import com.ks.example.spring.repositorio.AlumnoRepo;
import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * This class is used to provide services through the interface AlumnoRepo to the class EscuelaController
 * @see AlumnoRepo
 * @see com.ks.example.spring.controlador.EscuelaController
 */
@Log4j2
@Service
public class AlumnoService {

    public static final Marker marker = MarkerManager.getMarker("marker");

    @Autowired
    AlumnoRepo alumnoRepo;

    /**
     * @return Returns the result of the method findAll casted into a List of objects of type Alumno
     */
    public List<Alumno> findAll()
    {
        return (List<Alumno>) alumnoRepo.findAll();
    }

    /**
     * @param alumno Is an object which saves the data of a student
     * @return Returns the result of the method alumnoRepo.save();
     */
    public Alumno save(Alumno alumno){//FUNCIONA TAMBIEN COMO UPDATE
        if (alumno.getCalif() < 6.0d){
            log.warn(marker, "Error{}",alumno.getCalif());
        }
        return alumnoRepo.save(alumno);
    }

    /**
     * @param id Identification number of the registry entry on the table alumno
     */
    public void deleteById(Integer id){
        alumnoRepo.deleteById(id);
    }
}
