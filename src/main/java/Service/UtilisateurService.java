package Service;

import Model.Utilisateur;
import Repositorie.UtilisateurRepositorie;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UtilisateurService {

    private final UtilisateurRepositorie utilisateurRepositorie;

    public UtilisateurService(UtilisateurRepositorie utilisateurRepositorie) {
        this.utilisateurRepositorie = utilisateurRepositorie;
    }

    // 🔹 Récupérer tous les utilisateurs
    public List<Utilisateur> getAllUtilisateurs() {
        return utilisateurRepositorie.findAll();
    }

    // 🔹 Récupérer un utilisateur par son ID
    public Optional<Utilisateur> getUtilisateurById(Long id) {
        return utilisateurRepositorie.findById(id);
    }

    // 🔹 Ajouter un utilisateur
    public Utilisateur addUtilisateur(Utilisateur utilisateur) {
        return utilisateurRepositorie.save(utilisateur);
    }

    // 🔹 Modifier un utilisateur
    public Utilisateur updateUtilisateur(Long id, Utilisateur updatedUtilisateur) {
        return utilisateurRepositorie.findById(id)
                .map(utilisateur -> {
                    utilisateur.setNom(updatedUtilisateur.getNom());
                    utilisateur.setPrenom(updatedUtilisateur.getPrenom());
                    utilisateur.setEmail(updatedUtilisateur.getEmail());
                    utilisateur.setPassword(updatedUtilisateur.getPassword());
                    utilisateur.setRole(updatedUtilisateur.getRole());
                    return utilisateurRepositorie.save(utilisateur);
                })
                .orElseThrow(() -> new RuntimeException("Utilisateur non trouvé avec l'id : " + id));
    }

    // 🔹 Supprimer un utilisateur
    public void deleteUtilisateur(Long id) {
        utilisateurRepositorie.deleteById(id);
    }
}
