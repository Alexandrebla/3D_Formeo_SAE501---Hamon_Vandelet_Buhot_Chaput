package test.all.Service;

import test.all.model.Utilisateur;
import test.all.repository.UtilisateurRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UtilisateurService {

    private final UtilisateurRepository utilisateurRepository;

    public UtilisateurService(UtilisateurRepository utilisateurRepository) {
        this.utilisateurRepository = utilisateurRepository;
    }

    public List<Utilisateur> getAllUtilisateurs() { return utilisateurRepository.findAll(); }
    public Optional<Utilisateur> getUtilisateurById(Long id) { return utilisateurRepository.findById(id); }
    public Utilisateur addUtilisateur(Utilisateur utilisateur) { return utilisateurRepository.save(utilisateur); }

    public Utilisateur updateUtilisateur(Long id, Utilisateur updatedUtilisateur) {
        return utilisateurRepository.findById(id)
                .map(utilisateur -> {
                    utilisateur.setNom(updatedUtilisateur.getNom());
                    utilisateur.setPrenom(updatedUtilisateur.getPrenom());
                    utilisateur.setEmail(updatedUtilisateur.getEmail());
                    utilisateur.setPassword(updatedUtilisateur.getPassword());
                    utilisateur.setRole(updatedUtilisateur.getRole());
                    return utilisateurRepository.save(utilisateur);
                })
                .orElseThrow(() -> new RuntimeException("Utilisateur non trouvé avec l'id : " + id));
    }

    public void deleteUtilisateur(Long id) { utilisateurRepository.deleteById(id); }
}
