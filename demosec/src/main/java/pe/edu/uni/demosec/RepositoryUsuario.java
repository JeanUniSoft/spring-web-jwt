package pe.edu.uni.demosec;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryUsuario extends JpaRepository<Usuario, Integer> {

    Optional<Usuario> findByUsuario(String nombre);
}