package com.example.demo.Service;

import com.example.demo.Entity.Utilisateur;
import org.springframework.stereotype.Service;

@Service
public interface UtilisateurService {

    Utilisateur inscription(Utilisateur utilisateur);
    Utilisateur connexion(String email, String motDePasse);
}
