package com.devops.alumnosapi.api;

import com.devops.alumnosapi.model.Alumno;
import com.devops.alumnosapi.repository.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/alumno")
public class AlumnoAPI {

    @Autowired
    private AlumnoRepository alumnoRepository;

    @PostMapping
    public Alumno crearAlumno(@RequestBody Alumno a){
        return alumnoRepository.add(a);
    }

    @GetMapping
    public List<Alumno>findAll(){
        return alumnoRepository.findAll();
    }
}
