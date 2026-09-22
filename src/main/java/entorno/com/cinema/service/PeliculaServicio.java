package entorno.com.cinema.service;

import entorno.com.cinema.entity.Pelicula;
import entorno.com.cinema.repository.PeliculaRepository;

//import jakarta.transaction.Transactional;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import java.util.Optional;

import javax.management.RuntimeErrorException;

@Service
@RequiredArgsConstructor
public class PeliculaServicio {

    private final PeliculaRepository peliculaRepository;

    @Transactional(readOnly = true )
    public List<Pelicula> findall(){
        return this.peliculaRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Optional<Pelicula> findFilmID(Long id ){
        return peliculaRepository.findById(id);
    }

    @Transactional
    public void deletefilmID(Long id){
        if (peliculaRepository.existsById(id)){
            peliculaRepository.deleteById(id);
        }else{
            throw new RuntimeException("No exite pelicula con id "+id);
        }
    }

    @Transactional
    public void actfilm(Pelicula pelicula){
        
        if(peliculaRepository.existsById(pelicula.getID())){
            pelicula.setClasificacion(pelicula.getClasificacion());
            pelicula.setDuracion(pelicula.getDuracion());
            pelicula.setNombre(pelicula.getNombre());
            peliculaRepository.save(pelicula);
        }else{
        peliculaRepository.save(pelicula);
        }
    }

}
