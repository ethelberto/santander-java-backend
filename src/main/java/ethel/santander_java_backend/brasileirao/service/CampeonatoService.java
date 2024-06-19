package ethel.santander_java_backend.brasileirao.service;

import ethel.santander_java_backend.brasileirao.domain.model.Campeonato;

public interface CampeonatoService {
    Campeonato findById(Long id);

    Campeonato create(Campeonato campeonato);
}
