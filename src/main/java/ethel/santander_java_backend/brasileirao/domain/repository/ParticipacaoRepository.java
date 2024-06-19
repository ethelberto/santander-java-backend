package ethel.santander_java_backend.brasileirao.domain.repository;

import ethel.santander_java_backend.brasileirao.domain.model.Participacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParticipacaoRepository extends JpaRepository<Participacao, Long> {
}
