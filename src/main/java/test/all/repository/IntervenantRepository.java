package test.all.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import test.all.model.Intervenant;

public interface IntervenantRepository extends JpaRepository<Intervenant, Long> {
}
