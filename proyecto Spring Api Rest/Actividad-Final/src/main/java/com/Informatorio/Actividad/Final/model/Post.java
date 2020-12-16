package com.Informatorio.Actividad.Final.model;
import javax.persistence.Id;
import javax.persistence.*;
import javax.validation.constraints.*;
import java.sql.Date;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.ObjectMapper;
/**
 * Post
 */
@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String titulo;

    private String descripcion;

    private String Contenido;

    private Date fechaCreacion;
    
    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "autor", nullable = false)
    private Usuario usuario;

    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    
        
    private boolean publicado;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getContenido() {
        return Contenido;
    }
    public void setContenido(String contenido) {
        Contenido = contenido;
    }
    
    public Date getFechaCreacion() {
        return fechaCreacion;
    }
    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    
    public void setPublicado(boolean publicado) {
        this.publicado = publicado;
    }

}