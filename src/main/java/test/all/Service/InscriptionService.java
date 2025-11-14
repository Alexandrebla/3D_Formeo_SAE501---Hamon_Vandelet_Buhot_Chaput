package test.all.Service;

import org.springframework.stereotype.Service;
import test.all.model.Inscription;
import test.all.repository.InscriptionRepository;

import java.util.List;
import java.util.Optional;

@Service
public class InscriptionService {

    private final InscriptionRepository inscriptionRepository;

    public InscriptionService(InscriptionRepository inscriptionRepository) {
        this.inscriptionRepository = inscriptionRepository;
    }

    public List<Inscription> getAll() {
        return inscriptionRepository.findAll();
    }

    public Optional<Inscription> getById(Long id) {
        return inscriptionRepository.findById(id);
    }

    public Inscription create(Inscription inscription) {
        return inscriptionRepository.save(inscription);
    }

    public Inscription update(Long id, Inscription inscription) {
        inscription.setIdinscription(id);
        return inscriptionRepository.save(inscription);
    }

    public void delete(Long id) {
        inscriptionRepository.deleteById(id);
    }
}
