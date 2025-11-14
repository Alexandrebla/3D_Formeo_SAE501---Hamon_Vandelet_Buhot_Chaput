package test.all.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import test.all.model.Categorie;

public interface CategorieRepository extends JpaRepository<Categorie, Long> {
}
