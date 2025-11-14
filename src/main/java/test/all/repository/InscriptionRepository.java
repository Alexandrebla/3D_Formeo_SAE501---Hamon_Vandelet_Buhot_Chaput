package test.all.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import test.all.model.Inscription;

public interface InscriptionRepository extends JpaRepository<Inscription, Long> {
}
