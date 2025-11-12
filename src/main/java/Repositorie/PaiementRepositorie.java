package Repositorie;

import Model.Paiement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaiementRepositorie extends JpaRepository<Paiement, Long> {
}
