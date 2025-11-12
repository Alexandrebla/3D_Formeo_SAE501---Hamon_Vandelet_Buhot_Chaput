package Service;

import Model.Emargement;
import Repositorie.EmargementRepositorie;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class EmargementService {

    private final EmargementRepositorie emargementRepositorie;

    public EmargementService(EmargementRepositorie emargementRepositorie) {
        this.emargementRepositorie = emargementRepositorie;
    }

    public List<Emargement> getAllEmargements() {
        return emargementRepositorie.findAll();
    }

    public Optional<Emargement> getEmargementById(Long id) {
        return emargementRepositorie.findById(id);
    }

    public Emargement addEmargement(Emargement emargement) {
        return emargementRepositorie.save(emargement);
    }

    public Emargement updateEmargement(Long id, Emargement updatedEmargement) {
        return emargementRepositorie.findById(id).map(emargement -> {
            emargement.setPresent(updatedEmargement.isPresent());
            emargement.setDate(updatedEmargement.getDate());
            emargement.setUtilisateur(updatedEmargement.getUtilisateur());
            emargement.setSession(updatedEmargement.getSession());
            return emargementRepositorie.save(emargement);
        }).orElseThrow(() -> new RuntimeException("Emargement non trouvé"));
    }

    public void deleteEmargement(Long id) {
        emargementRepositorie.deleteById(id);
    }
}
