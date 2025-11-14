package test.all.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import test.all.model.Paiement;

public interface PaiementRepository extends JpaRepository<Paiement, Long> {
}
