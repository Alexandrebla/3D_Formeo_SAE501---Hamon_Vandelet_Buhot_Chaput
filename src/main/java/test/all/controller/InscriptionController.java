package test.all.controller;

import org.springframework.web.bind.annotation.*;
import test.all.model.Inscription;
import test.all.Service.InscriptionService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/inscriptions")
public class InscriptionController {

    private final InscriptionService inscriptionService;

    public InscriptionController(InscriptionService inscriptionService) {
        this.inscriptionService = inscriptionService;
    }

    @GetMapping
    public List<Inscription> getAll() {
        return inscriptionService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Inscription> getById(@PathVariable Long id) {
        return inscriptionService.getById(id);
    }

    @PostMapping
    public Inscription create(@RequestBody Inscription inscription) {
        return inscriptionService.create(inscription);
    }

    @PutMapping("/{id}")
    public Inscription update(@PathVariable Long id, @RequestBody Inscription inscription) {
        return inscriptionService.update(id, inscription);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        inscriptionService.delete(id);
    }
}
