package com.example.demo.Service;

import com.example.demo.Entity.Intervenant;
import com.example.demo.Repository.IntervenantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IntervenantService {

    @Autowired
    private IntervenantRepository intervenantRepository;

    public Intervenant ajouterIntervenant(Intervenant intervenant) {
        intervenant.setHeuresRealisees(0); // initialisation
        return intervenantRepository.save(intervenant);
    }

    public List<Intervenant> getAllIntervenants() {
        return intervenantRepository.findAll();
    }

    public Intervenant getIntervenantById(Long id) {
        return intervenantRepository.findById(id).orElse(null);
    }

    public Intervenant mettreAJourHeures(Long id, int heures) {
        Intervenant intervenant = getIntervenantById(id);
        if (intervenant != null) {
            intervenant.setHeuresRealisees(intervenant.getHeuresRealisees() + heures);
            return intervenantRepository.save(intervenant);
        }
        return null;
    }

    public void supprimerIntervenant(Long id) {
        intervenantRepository.deleteById(id);
    }
}
