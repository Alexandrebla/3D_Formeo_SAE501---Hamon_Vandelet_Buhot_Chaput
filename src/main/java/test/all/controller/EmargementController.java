package test.all.controller;

import org.springframework.web.bind.annotation.*;
import test.all.model.Emargement;
import test.all.Service.EmargementService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/emargements")
public class EmargementController {

    private final EmargementService emargementService;

    public EmargementController(EmargementService emargementService) {
        this.emargementService = emargementService;
    }

    @GetMapping
    public List<Emargement> getAll() {
        return emargementService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Emargement> getById(@PathVariable Long id) {
        return emargementService.getById(id);
    }

    @PostMapping
    public Emargement create(@RequestBody Emargement emargement) {
        return emargementService.create(emargement);
    }

    @PutMapping("/{id}")
    public Emargement update(@PathVariable Long id, @RequestBody Emargement emargement) {
        return emargementService.update(id, emargement);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        emargementService.delete(id);
    }
}
