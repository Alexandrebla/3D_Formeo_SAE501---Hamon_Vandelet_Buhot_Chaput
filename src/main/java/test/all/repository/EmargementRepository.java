package test.all.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import test.all.model.Emargement;

public interface EmargementRepository extends JpaRepository<Emargement, Long> {
}
