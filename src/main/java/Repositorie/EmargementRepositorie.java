package Repositorie;

import Model.Emargement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmargementRepositorie extends JpaRepository<Emargement, Long> {
}
