package com.Informatorio.Actividad.Final.controller;
import com.Informatorio.Actividad.Final.model.Usuario;
import com.Informatorio.Actividad.Final.repository.UsuarioRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.Map;
import java.util.HashMap;
/**
 * UsuarioController
 */
@RestController
@RequestMapping("/api/v1/usuario")
public class UsuarioController {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping
    public ResponseEntity<?> getusuarios() {
        return new ResponseEntity<>(usuarioRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> createusuario(@RequestBody Usuario usuario) {
        return new ResponseEntity<>(usuarioRepository.save(usuario), HttpStatus.CREATED);
    }

    @PutMapping("/{usuarioId}")
    public ResponseEntity<?> editusuario(@PathVariable Long usuarioId,@Valid @RequestBody Usuario usuario) {
        Usuario usuarios = usuarioRepository.getOne(usuarioId);
        usuarios.setNombre(usuario.getNombre());
        usuarios.setApellido(usuario.getApellido());
        usuarios.setCiudad(usuario.getCiudad());
        usuarios.setProvincia(usuario.getProvincia());
        usuarios.setPais(usuario.getPais());
        return new ResponseEntity<>(usuarioRepository.save(usuarios), HttpStatus.OK);
    }
    
    @DeleteMapping("/{usuarioId}")
    public ResponseEntity<?> deleteusuario(@PathVariable Long usuarioId) {
        Usuario eliminarusuario = usuarioRepository.getOne(usuarioId);
        usuarioRepository.delete(eliminarusuario);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
}