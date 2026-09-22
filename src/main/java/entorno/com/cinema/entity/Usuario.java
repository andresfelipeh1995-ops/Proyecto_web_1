package entorno.com.cinema.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;

@Data
@Entity 
@Table(name="usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id_usuario;

    @NotBlank(message = "El número de documento es requerido.")
    @Size(min = 8, max = 11, message = "El número de documento debe tener entre 8 y 11 caracteres.")
    @Pattern(regexp = "^\\d*$", message = "El número de documento solo puede contener dígitos.")
    @Column(name = "numero_documento", nullable = false, length = 11, unique = true)
    private String numDocumento;

    @NotBlank(message = "El nombre es requerido.")
    @Size(max = 50, message = "El nombre debe tener máximo 50 caracteres.")
    @Pattern(regexp = "^(?!\\s)(?!.*\\s$)[A-Za-zÁÉÍÓÚáéíóúñÑ'\\- ]+$", message = "El nombre solo puede contener letras, espacios intermedios, apóstrofes y guiones.")
    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;

    @NotBlank(message = "El apellido es requerido.")
    @Size(max = 50, message = "El apellido debe tener máximo 50 caracteres.")
    @Pattern(regexp = "^(?!\\s)(?!.*\\s$)[A-Za-zÁÉÍÓÚáéíóúñÑ'\\- ]+$", message = "El apellido solo puede contener letras, espacios intermedios, apóstrofes y guiones.")
    @Column(name = "apellido", nullable = false, length = 50)
    private String apellido;

    @NotBlank(message = "El email es requerido.")
    @Size(max = 50, message = "El email debe tener máximo 50 caracteres.")
    @Email(message = "El email debe tener un formato válido.")
    @Column(name = "email", nullable = true, length = 50)
    private String email;

    @Size(max = 100, message = "La dirección debe tener máximo 100 caracteres.")
    @Column(name = "direccion", nullable = true, length = 100)
    private String direccion;

}