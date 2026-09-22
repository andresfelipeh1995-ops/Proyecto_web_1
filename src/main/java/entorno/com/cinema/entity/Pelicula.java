package entorno.com.cinema.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="Peliculas")
public class Pelicula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false , length = 100)
    private String nombre;
    private Double duracion;
    private String clasificacion;

    // setters 

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }
    
    // getters 
    
    public String getNombre() {
        return nombre;
    }

    public Double getDuracion() {
        return duracion;
    }

    public String getClasificacion() {
        return clasificacion;
    }
    
    public Long getID(){
        return id;
    }
    
}
