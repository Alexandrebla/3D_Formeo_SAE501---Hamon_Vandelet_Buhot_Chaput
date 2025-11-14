package test.all.Service;

import org.springframework.stereotype.Service;
import test.all.model.Emargement;
import test.all.repository.EmargementRepository;

import java.util.List;
import java.util.Optional;

@Service
public class EmargementService {

    private final EmargementRepository emargementRepository;

    public EmargementService(EmargementRepository emargementRepository) {
        this.emargementRepository = emargementRepository;
    }

    public List<Emargement> getAll() {
        return emargementRepository.findAll();
    }

    public Optional<Emargement> getById(Long id) {
        return emargementRepository.findById(id);
    }

    public Emargement create(Emargement emargement) {
        return emargementRepository.save(emargement);
    }

    public Emargement update(Long id, Emargement emargement) {
        emargement.setIdemargement(id);
        return emargementRepository.save(emargement);
    }

    public void delete(Long id) {
        emargementRepository.deleteById(id);
    }
}
