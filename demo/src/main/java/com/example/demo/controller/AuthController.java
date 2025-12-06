package com.example.demo.controller;

import com.example.demo.Entity.Utilisateur;
import com.example.demo.Repository.UtilisateurRepository;
import com.example.demo.dto.AuthRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UtilisateurRepository utilisateurRepository;

    @PostMapping("/connexion")
    public Utilisateur connexion(@RequestBody AuthRequest request) {

        Utilisateur utilisateur = utilisateurRepository.findByEmail(request.getEmail())
                .orElseThrow(() -> new RuntimeException("Email introuvable"));

        if (!utilisateur.getMotDePasse().equals(request.getMotDePasse())) {
            throw new RuntimeException("Mot de passe incorrect");
        }

        return utilisateur;
    }
}
