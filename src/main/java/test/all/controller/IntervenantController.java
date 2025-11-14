package test.all.controller;

import org.springframework.web.bind.annotation.*;
import test.all.model.Intervenant;
import test.all.Service.IntervenantService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/intervenants")
public class IntervenantController {

    private final IntervenantService intervenantService;

    public IntervenantController(IntervenantService intervenantService) {
        this.intervenantService = intervenantService;
    }

    @GetMapping
    public List<Intervenant> getAll() {
        return intervenantService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Intervenant> getById(@PathVariable Long id) {
        return intervenantService.getById(id);
    }

    @PostMapping
    public Intervenant create(@RequestBody Intervenant intervenant) {
        return intervenantService.create(intervenant);
    }

    @PutMapping("/{id}")
    public Intervenant update(@PathVariable Long id, @RequestBody Intervenant intervenant) {
        return intervenantService.update(id, intervenant);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        intervenantService.delete(id);
    }
}
