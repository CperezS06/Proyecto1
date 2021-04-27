package com.ks.example.spring.servicio;

import com.ks.example.spring.modelo.Alumno;
import com.ks.example.spring.repositorio.AlumnoRepo;
import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Log4j2
@Service
public class AlumnoService {

    public static final Marker marker = MarkerManager.getMarker("marker");

    @Autowired
    AlumnoRepo alumnoRepo;

    public List<Alumno> findAll()
    {
        return (List<Alumno>) alumnoRepo.findAll();
    }

    public Alumno save(Alumno alumno){//FUNCIONA TAMBIEN COMO UPDATE
        if (alumno.getCalif() < 6.0d){
            //log.warn("La calificacion {} es reprobatoria, cambiar por 0",alumno.getCalif());
            log.info("La calificacion {} es reprobatoria, cambiar por 0",alumno.getCalif());
            log.error("La calificacion {} es reprobatoria, cambiar por 0",alumno.getCalif());
            log.fatal("La calificacion {} es reprobatoria, cambiar por 0",alumno.getCalif());
            log.debug("La calificacion {} es reprobatoria, cambiar por 0",alumno.getCalif());
            log.trace("La calificacion {} es reprobatoria, cambiar por 0",alumno.getCalif());
            log.warn(marker, "Error{}",alumno.getCalif());
        }
        return alumnoRepo.save(alumno);
    }

    public void deleteById(Integer id){
        alumnoRepo.deleteById(id);
    }
}
