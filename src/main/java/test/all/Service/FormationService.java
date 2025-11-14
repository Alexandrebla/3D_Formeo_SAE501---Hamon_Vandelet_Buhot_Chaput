package test.all.Service;

import org.springframework.stereotype.Service;
import test.all.model.Formation;
import test.all.repository.FormationRepository;

import java.util.List;
import java.util.Optional;

@Service
public class FormationService {

    private final FormationRepository formationRepository;

    public FormationService(FormationRepository formationRepository) {
        this.formationRepository = formationRepository;
    }

    public List<Formation> getAll() {
        return formationRepository.findAll();
    }

    public Optional<Formation> getById(Long id) {
        return formationRepository.findById(id);
    }

    public Formation create(Formation formation) {
        return formationRepository.save(formation);
    }

    public Formation update(Long id, Formation formation) {
        formation.setIdformation(id);
        return formationRepository.save(formation);
    }

    public void delete(Long id) {
        formationRepository.deleteById(id);
    }
}
