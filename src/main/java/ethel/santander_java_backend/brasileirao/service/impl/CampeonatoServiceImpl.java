package ethel.santander_java_backend.brasileirao.service.impl;

import ethel.santander_java_backend.brasileirao.domain.model.Campeonato;
import ethel.santander_java_backend.brasileirao.domain.repository.CampeonatoRepository;
import ethel.santander_java_backend.brasileirao.service.CampeonatoService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class CampeonatoServiceImpl implements CampeonatoService {
    private final CampeonatoRepository campeonatoRepository;

    public CampeonatoServiceImpl(CampeonatoRepository campeonatoRepository){
        this.campeonatoRepository = campeonatoRepository;
    }

    @Override
    public Campeonato findById(Long id) {
        return campeonatoRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Campeonato create(Campeonato campeonato) {
        if (campeonato.getId() != null && campeonatoRepository.existsById(campeonato.getId())) {
            throw new IllegalArgumentException("Esse campeonato já existe!");
        }
        return campeonatoRepository.save(campeonato);
    }
}
