package Service;

import Model.Inscription;
import Repositorie.InscriptionRepositorie;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class InscriptionService {

    private final InscriptionRepositorie inscriptionRepositorie;

    public InscriptionService(InscriptionRepositorie inscriptionRepositorie) {
        this.inscriptionRepositorie = inscriptionRepositorie;
    }

    public List<Inscription> getAllInscriptions() {
        return inscriptionRepositorie.findAll();
    }

    public Optional<Inscription> getInscriptionById(Long id) {
        return inscriptionRepositorie.findById(id);
    }

    public Inscription addInscription(Inscription inscription) {
        return inscriptionRepositorie.save(inscription);
    }

    public Inscription updateInscription(Long id, Inscription updatedInscription) {
        return inscriptionRepositorie.findById(id).map(inscription -> {
            inscription.setDateinscription(updatedInscription.getDateinscription());
            inscription.setStatutpaiement(updatedInscription.isStatutpaiement());
            inscription.setFormation(updatedInscription.getFormation());
            inscription.setUtilisateur(updatedInscription.getUtilisateur());
            return inscriptionRepositorie.save(inscription);
        }).orElseThrow(() -> new RuntimeException("Inscription non trouvée"));
    }

    public void deleteInscription(Long id) {
        inscriptionRepositorie.deleteById(id);
    }
}
