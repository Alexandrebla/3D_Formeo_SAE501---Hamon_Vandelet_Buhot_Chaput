package test.all.controller;

import org.springframework.web.bind.annotation.*;
import test.all.model.Categorie;
import test.all.Service.CategorieService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/categories")
public class CategorieController {

    private final CategorieService categorieService;

    public CategorieController(CategorieService categorieService) {
        this.categorieService = categorieService;
    }

    @GetMapping
    public List<Categorie> getAll() {
        return categorieService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Categorie> getById(@PathVariable Long id) {
        return categorieService.getById(id);
    }

    @PostMapping
    public Categorie create(@RequestBody Categorie categorie) {
        return categorieService.create(categorie);
    }

    @PutMapping("/{id}")
    public Categorie update(@PathVariable Long id, @RequestBody Categorie categorie) {
        return categorieService.update(id, categorie);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        categorieService.delete(id);
    }
}
