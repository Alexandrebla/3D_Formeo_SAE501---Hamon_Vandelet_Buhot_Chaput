package test.all.Service;

import org.springframework.stereotype.Service;
import test.all.model.Evaluation;
import test.all.repository.EvaluationRepository;

import java.util.List;
import java.util.Optional;

@Service
public class EvaluationService {

    private final EvaluationRepository evaluationRepository;

    public EvaluationService(EvaluationRepository evaluationRepository) {
        this.evaluationRepository = evaluationRepository;
    }

    public List<Evaluation> getAll() {
        return evaluationRepository.findAll();
    }

    public Optional<Evaluation> getById(Long id) {
        return evaluationRepository.findById(id);
    }

    public Evaluation create(Evaluation evaluation) {
        return evaluationRepository.save(evaluation);
    }

    public Evaluation update(Long id, Evaluation evaluation) {
        evaluation.setIdevaluation(id);
        return evaluationRepository.save(evaluation);
    }

    public void delete(Long id) {
        evaluationRepository.deleteById(id);
    }
}
