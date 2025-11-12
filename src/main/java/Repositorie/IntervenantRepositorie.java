package Repositorie;

import Model.Intervenant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IntervenantRepositorie extends JpaRepository<Intervenant, Long> {
}
