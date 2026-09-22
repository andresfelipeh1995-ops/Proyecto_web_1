package com.andresfelipeh1995.proyweb1.repository;

import com.andresfelipeh1995.proyweb1.entity.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface PeliculaRepository extends JpaRepository<Pelicula,Long>{

    public List<Pelicula> findByNombre(String Nombre);

}
