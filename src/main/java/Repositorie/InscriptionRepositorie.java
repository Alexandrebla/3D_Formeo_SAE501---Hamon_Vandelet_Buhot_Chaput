package Repositorie;

import Model.Inscription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InscriptionRepositorie extends JpaRepository<Inscription, Long> {
}
