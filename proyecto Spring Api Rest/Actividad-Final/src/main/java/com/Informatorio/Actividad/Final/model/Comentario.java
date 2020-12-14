package com.Informatorio.Actividad.Final.model;
import javax.persistence.Id;
import javax.persistence.*;
import javax.validation.constraints.*;
import java.sql.Date;
/**
 * Comentario
 */
@Entity
public class Comentario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String autor;

    private Date fechaCreacion;

    @Size(max = 200)
    private String comentario;
     
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }
    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getComentario() {
        return comentario;
    }
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    
}