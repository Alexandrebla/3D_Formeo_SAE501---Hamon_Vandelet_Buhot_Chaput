package test.all.Service;

import org.springframework.stereotype.Service;
import test.all.model.Categorie;
import test.all.repository.CategorieRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CategorieService {

    private final CategorieRepository categorieRepository;

    public CategorieService(CategorieRepository categorieRepository) {
        this.categorieRepository = categorieRepository;
    }

    public List<Categorie> getAll() {
        return categorieRepository.findAll();
    }

    public Optional<Categorie> getById(Long id) {
        return categorieRepository.findById(id);
    }

    public Categorie create(Categorie categorie) {
        return categorieRepository.save(categorie);
    }

    public Categorie update(Long id, Categorie categorie) {
        categorie.setIdcategorie(id);
        return categorieRepository.save(categorie);
    }

    public void delete(Long id) {
        categorieRepository.deleteById(id);
    }
}
