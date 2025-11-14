package test.all.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import test.all.model.Formation;

public interface FormationRepository extends JpaRepository<Formation, Long> {
}
