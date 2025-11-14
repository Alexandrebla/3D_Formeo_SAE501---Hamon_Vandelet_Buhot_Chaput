package test.all.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import test.all.model.Evaluation;

public interface EvaluationRepository extends JpaRepository<Evaluation, Long> {
}
