package test.all.controller;

import org.springframework.web.bind.annotation.*;
import test.all.model.Formation;
import test.all.Service.FormationService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/formations")
public class FormationController {

    private final FormationService formationService;

    public FormationController(FormationService formationService) {
        this.formationService = formationService;
    }

    @GetMapping
    public List<Formation> getAll() {
        return formationService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Formation> getById(@PathVariable Long id) {
        return formationService.getById(id);
    }

    @PostMapping
    public Formation create(@RequestBody Formation formation) {
        return formationService.create(formation);
    }

    @PutMapping("/{id}")
    public Formation update(@PathVariable Long id, @RequestBody Formation formation) {
        return formationService.update(id, formation);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        formationService.delete(id);
    }
}
