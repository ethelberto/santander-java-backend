package ethel.santander_java_backend.brasileirao.domain.repository;

import ethel.santander_java_backend.brasileirao.domain.model.Torneio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TorneioRepository extends JpaRepository<Torneio, Long> {
}
