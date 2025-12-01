package com.example.demo.controller;

import com.example.demo.Entity.Utilisateur;
import com.example.demo.Service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@RestController
@RequestMapping("/api/utilisateurs")
public class UtilisateurController {

    @Autowired
    private UtilisateurService utilisateurService;

    @PostMapping("/inscription")
    public ResponseEntity<Utilisateur> inscription(@RequestBody Utilisateur utilisateur) {
        Utilisateur saved = utilisateurService.inscription(utilisateur);
        return ResponseEntity.ok(saved);
    }

    @PostMapping("/connexion")
    public ResponseEntity<Utilisateur> connexion(@RequestBody Map<String, String> login) {
        String email = login.get("email");
        String motDePasse = login.get("motDePasse");

        Utilisateur utilisateur = utilisateurService.connexion(email, motDePasse);
        return ResponseEntity.ok(utilisateur);
    }
}
