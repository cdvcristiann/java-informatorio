package com.Informatorio.Actividad.Final.model;
import javax.persistence.Id;
import javax.persistence.*;
import javax.validation.constraints.*;
import java.sql.Date;
import java.util.List;
import java.util.ArrayList;
import java.util.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
/**
 * Usuario
 */
@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nombre;

    private String apellido;

    @Column(unique=true)
    private String email;

    private String password;

    private Date fechaCreacion;

    private String ciudad;

    private String provincia;

    private String pais;

    @OneToMany(mappedBy = "usuario" , cascade=CascadeType.ALL)
    private List<Post> post = new ArrayList<>();

    @OneToMany(mappedBy = "usuario" , cascade=CascadeType.ALL)
    private List<Comentario> comentario = new ArrayList<>();

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    @JsonIgnore
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public Date getFechaCreacion() {
        return fechaCreacion;
    }
    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getProvincia() {
        return provincia;
    }
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }

    public void addPost(Post post){
        this.post.add(post);
        post.setUsuario(this);
    }
    public void addComentario(Comentario comentario){
        this.comentario.add(comentario);
        comentario.setUsuario(this);
    }
}