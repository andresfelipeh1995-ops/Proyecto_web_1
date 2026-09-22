package entorno.com.cinema.controller;

import entorno.com.cinema.entity.Pelicula;
import entorno.com.cinema.service.PeliculaServicio;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/pelicula")
public class PeliculaController {

    private final PeliculaServicio peliculaServicio;

    @GetMapping
    public List<Pelicula> find_all_Peliculas(){
        return this.peliculaServicio.findall();
    }
    
    @PostMapping
    public ResponseEntity<Void> crear_pelicula(@RequestBody Pelicula pelicula){
        this.peliculaServicio.actfilm(pelicula);
        return ResponseEntity.ok().build();
    }   
    
    @GetMapping("/{id}")
    public ResponseEntity<Pelicula> find_peliculaID(@PathVariable Long id){
        return peliculaServicio.findFilmID(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

}
