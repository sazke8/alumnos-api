package com.devops.alumnosapi.repository;

import com.devops.alumnosapi.model.Alumno;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface AlumnoRepository {

    public Alumno add(Alumno alumno);
    public List<Alumno> findAll();
}
