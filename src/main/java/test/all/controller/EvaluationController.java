package test.all.controller;

import org.springframework.web.bind.annotation.*;
import test.all.model.Evaluation;
import test.all.Service.EvaluationService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/evaluations")
public class EvaluationController {

    private final EvaluationService evaluationService;

    public EvaluationController(EvaluationService evaluationService) {
        this.evaluationService = evaluationService;
    }

    @GetMapping
    public List<Evaluation> getAll() {
        return evaluationService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Evaluation> getById(@PathVariable Long id) {
        return evaluationService.getById(id);
    }

    @PostMapping
    public Evaluation create(@RequestBody Evaluation evaluation) {
        return evaluationService.create(evaluation);
    }

    @PutMapping("/{id}")
    public Evaluation update(@PathVariable Long id, @RequestBody Evaluation evaluation) {
        return evaluationService.update(id, evaluation);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        evaluationService.delete(id);
    }
}
