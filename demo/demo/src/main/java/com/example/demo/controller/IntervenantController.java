package com.example.demo.controller;

import com.example.demo.Entity.Intervenant;
import com.example.demo.Service.IntervenantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/intervenants")
public class IntervenantController {

    @Autowired
    private IntervenantService intervenantService;

    @PostMapping("/ajouter")
    public ResponseEntity<Intervenant> ajouter(@RequestBody Intervenant intervenant) {
        Intervenant saved = intervenantService.ajouterIntervenant(intervenant);
        return ResponseEntity.ok(saved);
    }

    @GetMapping("/liste")
    public ResponseEntity<List<Intervenant>> liste() {
        return ResponseEntity.ok(intervenantService.getAllIntervenants());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Intervenant> getById(@PathVariable Long id) {
        return ResponseEntity.ok(intervenantService.getIntervenantById(id));
    }

    @PostMapping("/{id}/ajouter-heures")
    public ResponseEntity<Intervenant> ajouterHeures(
            @PathVariable Long id,
            @RequestBody Integer heures) {
        return ResponseEntity.ok(intervenantService.mettreAJourHeures(id, heures));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        intervenantService.supprimerIntervenant(id);
        return ResponseEntity.noContent().build();
    }
}

