package ethel.santander_java_backend.brasileirao.domain.repository;

import ethel.santander_java_backend.brasileirao.domain.model.Campeonato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CampeonatoRepository extends JpaRepository<Campeonato, Long> {
}
