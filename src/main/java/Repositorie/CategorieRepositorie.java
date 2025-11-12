package Repositorie;

import Model.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategorieRepositorie extends JpaRepository<Categorie, Long> {
}
