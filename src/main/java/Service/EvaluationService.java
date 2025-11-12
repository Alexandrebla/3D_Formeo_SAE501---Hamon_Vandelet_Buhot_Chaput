package Service;

import Model.Evaluation;
import Repositorie.EvaluationRepositorie;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class EvaluationService {

    private final EvaluationRepositorie evaluationRepositorie;

    public EvaluationService(EvaluationRepositorie evaluationRepositorie) {
        this.evaluationRepositorie = evaluationRepositorie;
    }

    public List<Evaluation> getAllEvaluations() {
        return evaluationRepositorie.findAll();
    }

    public Optional<Evaluation> getEvaluationById(Long id) {
        return evaluationRepositorie.findById(id);
    }

    public Evaluation addEvaluation(Evaluation evaluation) {
        return evaluationRepositorie.save(evaluation);
    }

    public Evaluation updateEvaluation(Long id, Evaluation updatedEvaluation) {
        return evaluationRepositorie.findById(id).map(evaluation -> {
            evaluation.setNote(updatedEvaluation.getNote());
            evaluation.setDate(updatedEvaluation.getDate());
            evaluation.setUtilisateur(updatedEvaluation.getUtilisateur());
            return evaluationRepositorie.save(evaluation);
        }).orElseThrow(() -> new RuntimeException("Évaluation non trouvée"));
    }

    public void deleteEvaluation(Long id) {
        evaluationRepositorie.deleteById(id);
    }
}
