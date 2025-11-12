package Repositorie;

import Model.Formation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormationRepositorie extends JpaRepository<Formation, Long> {
}
