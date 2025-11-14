package test.all.Service;

import org.springframework.stereotype.Service;
import test.all.model.Intervenant;
import test.all.repository.IntervenantRepository;

import java.util.List;
import java.util.Optional;

@Service
public class IntervenantService {

    private final IntervenantRepository intervenantRepository;

    public IntervenantService(IntervenantRepository intervenantRepository) {
        this.intervenantRepository = intervenantRepository;
    }

    public List<Intervenant> getAll() {
        return intervenantRepository.findAll();
    }

    public Optional<Intervenant> getById(Long id) {
        return intervenantRepository.findById(id);
    }

    public Intervenant create(Intervenant intervenant) {
        return intervenantRepository.save(intervenant);
    }

    public Intervenant update(Long id, Intervenant intervenant) {
        intervenant.setIdintervenant(id);
        return intervenantRepository.save(intervenant);
    }

    public void delete(Long id) {
        intervenantRepository.deleteById(id);
    }
}
