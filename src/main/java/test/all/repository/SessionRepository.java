package test.all.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import test.all.model.Session;

public interface SessionRepository extends JpaRepository<Session, Long> {
}
