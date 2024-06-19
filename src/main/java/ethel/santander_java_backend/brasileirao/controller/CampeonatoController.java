package ethel.santander_java_backend.brasileirao.controller;

import ethel.santander_java_backend.brasileirao.domain.model.Campeonato;
import ethel.santander_java_backend.brasileirao.service.CampeonatoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/campeonatos")
public class CampeonatoController {

    private final CampeonatoService campeonatoService;

    public CampeonatoController(CampeonatoService campeonatoService) {
        this.campeonatoService = campeonatoService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Campeonato> findById(@PathVariable Long id) {
        var campeonato = campeonatoService.findById(id);
        return ResponseEntity.ok(campeonato);
    }

    @PostMapping
    public ResponseEntity<Campeonato> create(@RequestBody Campeonato campeonatoACriar) {
        var campeonato = campeonatoService.create(campeonatoACriar);
        URI Location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(campeonato.getId())
                .toUri();
        return ResponseEntity.created(Location).body(campeonato);
    }

}
