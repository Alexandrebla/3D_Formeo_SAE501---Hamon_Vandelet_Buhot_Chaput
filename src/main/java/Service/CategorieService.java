package Service;

import Model.Categorie;
import Repositorie.CategorieRepositorie;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CategorieService {

    private final CategorieRepositorie categorieRepositorie;

    public CategorieService(CategorieRepositorie categorieRepositorie) {
        this.categorieRepositorie = categorieRepositorie;
    }

    public List<Categorie> getAllCategories() {
        return categorieRepositorie.findAll();
    }

    public Optional<Categorie> getCategorieById(Long id) {
        return categorieRepositorie.findById(id);
    }

    public Categorie addCategorie(Categorie categorie) {
        return categorieRepositorie.save(categorie);
    }

    public Categorie updateCategorie(Long id, Categorie updatedCategorie) {
        return categorieRepositorie.findById(id).map(categorie -> {
            categorie.setNom(updatedCategorie.getNom());
            return categorieRepositorie.save(categorie);
        }).orElseThrow(() -> new RuntimeException("Categorie non trouvée"));
    }

    public void deleteCategorie(Long id) {
        categorieRepositorie.deleteById(id);
    }
}
