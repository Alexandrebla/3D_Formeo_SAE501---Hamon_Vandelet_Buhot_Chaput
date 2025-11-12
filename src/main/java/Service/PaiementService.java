package Service;

import Model.Paiement;
import Repositorie.PaiementRepositorie;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class PaiementService {

    private final PaiementRepositorie paiementRepositorie;

    public PaiementService(PaiementRepositorie paiementRepositorie) {
        this.paiementRepositorie = paiementRepositorie;
    }

    public List<Paiement> getAllPaiements() {
        return paiementRepositorie.findAll();
    }

    public Optional<Paiement> getPaiementById(Long id) {
        return paiementRepositorie.findById(id);
    }

    public Paiement addPaiement(Paiement paiement) {
        return paiementRepositorie.save(paiement);
    }

    public Paiement updatePaiement(Long id, Paiement updatedPaiement) {
        return paiementRepositorie.findById(id).map(paiement -> {
            paiement.setDatepaiement(updatedPaiement.getDatepaiement());
            paiement.setMontant(updatedPaiement.getMontant());
            paiement.setMoyenpaiement(updatedPaiement.getMoyenpaiement());
            paiement.setInscription(updatedPaiement.getInscription());
            return paiementRepositorie.save(paiement);
        }).orElseThrow(() -> new RuntimeException("Paiement non trouvé"));
    }

    public void deletePaiement(Long id) {
        paiementRepositorie.deleteById(id);
    }
}
