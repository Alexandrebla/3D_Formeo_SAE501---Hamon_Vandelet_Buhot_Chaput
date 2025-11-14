package test.all.Service;

import org.springframework.stereotype.Service;
import test.all.model.Paiement;
import test.all.repository.PaiementRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PaiementService {

    private final PaiementRepository paiementRepository;

    public PaiementService(PaiementRepository paiementRepository) {
        this.paiementRepository = paiementRepository;
    }

    public List<Paiement> getAll() {
        return paiementRepository.findAll();
    }

    public Optional<Paiement> getById(Long id) {
        return paiementRepository.findById(id);
    }

    public Paiement create(Paiement paiement) {
        return paiementRepository.save(paiement);
    }

    public Paiement update(Long id, Paiement paiement) {
        paiement.setIdpaiement(id);
        return paiementRepository.save(paiement);
    }

    public void delete(Long id) {
        paiementRepository.deleteById(id);
    }
}
