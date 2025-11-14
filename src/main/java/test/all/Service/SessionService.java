package test.all.Service;

import org.springframework.stereotype.Service;
import test.all.model.Session;
import test.all.repository.SessionRepository;

import java.util.List;
import java.util.Optional;

@Service
public class SessionService {

    private final SessionRepository sessionRepository;

    public SessionService(SessionRepository sessionRepository) {
        this.sessionRepository = sessionRepository;
    }

    public List<Session> getAll() {
        return sessionRepository.findAll();
    }

    public Optional<Session> getById(Long id) {
        return sessionRepository.findById(id);
    }

    public Session create(Session session) {
        return sessionRepository.save(session);
    }

    public Session update(Long id, Session session) {
        session.setIdsession(id);
        return sessionRepository.save(session);
    }

    public void delete(Long id) {
        sessionRepository.deleteById(id);
    }
}
