package fiap.com.br.cp2_java.repository;

import fiap.com.br.cp2_java.entity.Brinquedo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrinquedoRepository extends JpaRepository<Brinquedo, Long> {
}
