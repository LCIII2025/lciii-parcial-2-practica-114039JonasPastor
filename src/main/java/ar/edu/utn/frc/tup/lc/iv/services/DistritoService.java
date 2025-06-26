package ar.edu.utn.frc.tup.lc.iv.services;

import ar.edu.utn.frc.tup.lc.iv.models.Distrito;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DistritoService {
    List<Distrito> getDistritos();
    List<Distrito> getByNombre(String distrito_nombre);
}
