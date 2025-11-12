package Service;

import Model.Intervenant;
import Repositorie.IntervenantRepositorie;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class IntervenantService {

    private final IntervenantRepositorie intervenantRepositorie;

    public IntervenantService(IntervenantRepositorie intervenantRepositorie) {
        this.intervenantRepositorie = intervenantRepositorie;
    }

    public List<Intervenant> getAllIntervenants() {
        return intervenantRepositorie.findAll();
    }

    public Optional<Intervenant> getIntervenantById(Long id) {
        return intervenantRepositorie.findById(id);
    }

    public Intervenant addIntervenant(Intervenant intervenant) {
        return intervenantRepositorie.save(intervenant);
    }

    public Intervenant updateIntervenant(Long id, Intervenant updatedIntervenant) {
        return intervenantRepositorie.findById(id).map(intervenant -> {
            intervenant.setNom(updatedIntervenant.getNom());
            intervenant.setPrenom(updatedIntervenant.getPrenom());
            intervenant.setSpecialite(updatedIntervenant.getSpecialite());
            intervenant.setCoordonnees(updatedIntervenant.getCoordonnees());
            intervenant.setStatut(updatedIntervenant.getStatut());
            return intervenantRepositorie.save(intervenant);
        }).orElseThrow(() -> new RuntimeException("Intervenant non trouvé"));
    }

    public void deleteIntervenant(Long id) {
        intervenantRepositorie.deleteById(id);
    }
}
