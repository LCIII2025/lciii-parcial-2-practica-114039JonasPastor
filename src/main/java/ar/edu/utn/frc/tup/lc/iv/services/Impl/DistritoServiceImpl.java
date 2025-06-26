package ar.edu.utn.frc.tup.lc.iv.services.Impl;

import ar.edu.utn.frc.tup.lc.iv.models.Distrito;
import ar.edu.utn.frc.tup.lc.iv.repositories.DistritoRepository;
import ar.edu.utn.frc.tup.lc.iv.services.DistritoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DistritoServiceImpl implements DistritoService {

    @Autowired
    DistritoRepository distritoRepository;

    @Override
    public List<Distrito> getDistritos() {
        return distritoRepository.findAll();
    }

    @Override
    public List<Distrito> getByNombre(String distrito_nombre) {
        return distritoRepository.getByName(distrito_nombre);
    }
}
