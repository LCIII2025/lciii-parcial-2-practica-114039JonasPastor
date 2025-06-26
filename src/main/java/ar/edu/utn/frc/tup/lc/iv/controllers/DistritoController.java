package ar.edu.utn.frc.tup.lc.iv.controllers;

import ar.edu.utn.frc.tup.lc.iv.models.Distrito;
import ar.edu.utn.frc.tup.lc.iv.services.DistritoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/distritos")
public class DistritoController {

    @Autowired
    private DistritoService distritoService;

    @GetMapping("")
    public ResponseEntity<List<Distrito>> getDistritosByNombre(
            @RequestParam(name = "distrito_nombre", required = false) String distrito_nombre) {
        if(distrito_nombre != null && !distrito_nombre.isBlank()) {
            return ResponseEntity.ok(distritoService.getByNombre(distrito_nombre));
        } else{
            return ResponseEntity.ok(distritoService.getDistritos());
        }
    }
}
