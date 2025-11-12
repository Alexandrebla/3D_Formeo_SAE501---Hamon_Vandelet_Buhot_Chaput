package Service;

import Model.Formation;
import Repositorie.FormationRepositorie;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class FormationService {

    private final FormationRepositorie formationRepositorie;

    public FormationService(FormationRepositorie formationRepositorie) {
        this.formationRepositorie = formationRepositorie;
    }

    public List<Formation> getAllFormations() {
        return formationRepositorie.findAll();
    }

    public Optional<Formation> getFormationById(Long id) {
        return formationRepositorie.findById(id);
    }

    public Formation addFormation(Formation formation) {
        return formationRepositorie.save(formation);
    }

    public Formation updateFormation(Long id, Formation updatedFormation) {
        return formationRepositorie.findById(id).map(formation -> {
            formation.setNom(updatedFormation.getNom());
            formation.setTarif(updatedFormation.getTarif());
            formation.setDuree(updatedFormation.getDuree());
            formation.setCategorie(updatedFormation.getCategorie());
            return formationRepositorie.save(formation);
        }).orElseThrow(() -> new RuntimeException("Formation non trouvée"));
    }

    public void deleteFormation(Long id) {
        formationRepositorie.deleteById(id);
    }
}
