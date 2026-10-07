package pe.edu.uni.demosec;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.http.ResponseEntity;


@RestController 
public class ControllerDemo {

    @GetMapping("/hola")
    public String ejecutarHola() {
        return "hola";
    }

    @GetMapping("/info")
    @PreAuthorize("hasAnyRole('ADMIN')")
    public ResponseEntity<String> obtenerInfo() {
        return ResponseEntity.ok("Contenido solo para admin");
    }

}