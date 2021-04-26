package com.ks.example.spring.controlador;

import com.ks.example.spring.modelo.Alumno;
import com.ks.example.spring.repositorio.AlumnoRepo;
import com.ks.example.spring.servicio.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/inicio")
public class EscuelaController
{
    @Autowired
    private AlumnoService alumnoService;

    @GetMapping
    public List<Alumno> findAll(){
        return alumnoService.findAll();
    }

    @PostMapping
    public Alumno save(@RequestBody Alumno alumno){
        return alumnoService.save(alumno);
    }

    @PutMapping
    public Alumno update(@RequestBody Alumno alumno){
        return alumnoService.save(alumno);
    }

    @DeleteMapping (path ="/{id}")
    public void delete(@PathVariable Integer id){
        alumnoService.deleteById(id);
    }
}
