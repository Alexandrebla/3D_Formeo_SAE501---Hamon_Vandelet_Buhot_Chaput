package test.all.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import test.all.model.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {
}
