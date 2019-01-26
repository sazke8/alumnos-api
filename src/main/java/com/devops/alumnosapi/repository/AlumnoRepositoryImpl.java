package com.devops.alumnosapi.repository;

import com.devops.alumnosapi.model.Alumno;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AlumnoRepositoryImpl implements AlumnoRepository {

    private static List<Alumno> alumnos= new ArrayList<>();

    static{

        alumnos.add(new Alumno(1,"Brandon","Guadarrama Duran",25,"Ing en sistemas"));
    }

    @Override
    public Alumno add(Alumno alumno) {
        alumno.setId(alumnos.size()+1);
         alumnos.add(alumno);
         return alumno;
    }

    @Override
    public List<Alumno> findAll() {
        return alumnos;
    }
}
