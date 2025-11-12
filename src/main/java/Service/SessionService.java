package Service;

import Model.Session;
import Repositorie.SessionRepositorie;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class SessionService {

    private final SessionRepositorie sessionRepositorie;

    public SessionService(SessionRepositorie sessionRepositorie) {
        this.sessionRepositorie = sessionRepositorie;
    }

    public List<Session> getAllSessions() {
        return sessionRepositorie.findAll();
    }

    public Optional<Session> getSessionById(Long id) {
        return sessionRepositorie.findById(id);
    }

    public Session addSession(Session session) {
        return sessionRepositorie.save(session);
    }

    public Session updateSession(Long id, Session updatedSession) {
        return sessionRepositorie.findById(id).map(session -> {
            session.setDatedebut(updatedSession.getDatedebut());
            session.setDatefin(updatedSession.getDatefin());
            session.setLieu(updatedSession.getLieu());
            session.setNplaces(updatedSession.getNplaces());
            session.setFormation(updatedSession.getFormation());
            session.setIntervenant(updatedSession.getIntervenant());
            return sessionRepositorie.save(session);
        }).orElseThrow(() -> new RuntimeException("Session non trouvée"));
    }

    public void deleteSession(Long id) {
        sessionRepositorie.deleteById(id);
    }
}
