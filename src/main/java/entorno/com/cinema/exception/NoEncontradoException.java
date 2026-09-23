package entorno.com.cinema.exception;

public class NoEncontradoException extends RuntimeException{
    public NoEncontradoException(String mensaje){
        super(mensaje);
    }
}
