package entorno.com.cinema.repository;

import entorno.com.cinema.entity.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface PeliculaRepository extends JpaRepository<Pelicula,Long>{

    public List<Pelicula> findByNombre(String Nombre);

}
