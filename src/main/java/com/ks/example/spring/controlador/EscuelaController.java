package com.ks.example.spring.controlador;

import com.ks.example.spring.modelo.Alumno;
import com.ks.example.spring.servicio.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/** This class is used to provide control from web to the transactions of the database
 *
 */
@RestController
@RequestMapping(path="/inicio")
public class EscuelaController
{
    @Autowired
    private AlumnoService alumnoService;

    /** This method is used to view all the entries of Alumno of the database
     * @return Returns the result of the alumnoService.findAll(); method
     */
    @GetMapping
    public List<Alumno> findAll()
    {
        return alumnoService.findAll();
    }

    /** This method is used to save a new entry of Alumno into database
     * @param alumno Is an object which saves the data of a student
     * @return Returns the result of the alumnoService.save(); method
     */
    @PostMapping
    public Alumno save(@RequestBody Alumno alumno) {
        return alumnoService.save(alumno);
    }

    /** This method is used to update an entry of Alumno from the database
     * @param alumno Is an object which saves the data of a student
     * @return Returns the result of the alumnoService.update(); method
     */
    @PutMapping
    public Alumno update(@RequestBody Alumno alumno)
    {
        return alumnoService.save(alumno);
    }

    /** This method is used to delete an entry of Alumno from the database
     * @param id Is the identification number of Alumno
     */
    @DeleteMapping (path ="/{id}")
    public void delete(@PathVariable Integer id)
    {
        alumnoService.deleteById(id);
    }
}
