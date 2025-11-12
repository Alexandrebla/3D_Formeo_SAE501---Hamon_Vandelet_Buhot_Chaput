package Repositorie;

import Model.Session;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SessionRepositorie extends JpaRepository<Session, Long> {
}
