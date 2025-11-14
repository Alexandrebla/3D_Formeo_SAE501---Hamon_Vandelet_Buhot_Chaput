package test.all.controller;

import org.springframework.web.bind.annotation.*;
import test.all.model.Paiement;
import test.all.Service.PaiementService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/paiements")
public class PaiementController {

    private final PaiementService paiementService;

    public PaiementController(PaiementService paiementService) {
        this.paiementService = paiementService;
    }

    @GetMapping
    public List<Paiement> getAll() {
        return paiementService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Paiement> getById(@PathVariable Long id) {
        return paiementService.getById(id);
    }

    @PostMapping
    public Paiement create(@RequestBody Paiement paiement) {
        return paiementService.create(paiement);
    }

    @PutMapping("/{id}")
    public Paiement update(@PathVariable Long id, @RequestBody Paiement paiement) {
        return paiementService.update(id, paiement);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        paiementService.delete(id);
    }
}
