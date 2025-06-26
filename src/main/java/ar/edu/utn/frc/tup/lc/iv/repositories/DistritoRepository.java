package ar.edu.utn.frc.tup.lc.iv.repositories;

import ar.edu.utn.frc.tup.lc.iv.models.Distrito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DistritoRepository extends JpaRepository<Distrito, Long> {
    @Query("SELECT d FROM Distrito d WHERE LOWER(d.nombre) LIKE LOWER(CONCAT('%', :nombre, '%'))")
    List<Distrito> getByName(@Param("nombre") String nombre);
}
