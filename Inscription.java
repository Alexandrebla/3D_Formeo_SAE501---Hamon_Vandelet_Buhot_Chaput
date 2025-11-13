package test.all.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "inscriptions")
public class Inscription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idinscription;

    private LocalDate dateInscription;
    private String statut;

    // Relation avec Utilisateur (plusieurs inscriptions possibles pour un utilisateur)
    @ManyToOne
    @JoinColumn(name = "idutilisateur", nullable = false)
    private Utilisateur utilisateur;

    // Relation avec Formation
    @ManyToOne
    @JoinColumn(name = "idformation", nullable = false)
    private Formation formation;

    // Relation avec Paiement (une inscription a un seul paiement)
    @OneToOne(mappedBy = "inscription", cascade = CascadeType.ALL)
    private Paiement paiement;

    public Inscription() {}

    public Inscription(Long idinscription, LocalDate dateInscription, String statut,
                       Utilisateur utilisateur, Formation formation, Paiement paiement) {
        this.idinscription = idinscription;
        this.dateInscription = dateInscription;
        this.statut = statut;
        this.utilisateur = utilisateur;
        this.formation = formation;
        this.paiement = paiement;
    }

    // Getters et setters
    public Long getIdinscription() {
        return idinscription;
    }

    public void setIdinscription(Long idinscription) {
        this.idinscription = idinscription;
    }

    public LocalDate getDateInscription() {
        return dateInscription;
    }

    public void setDateInscription(LocalDate dateInscription) {
        this.dateInscription = dateInscription;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public Formation getFormation() {
        return formation;
    }

    public void setFormation(Formation formation) {
        this.formation = formation;
    }

    public Paiement getPaiement() {
        return paiement;
    }

    public void setPaiement(Paiement paiement) {
        this.paiement = paiement;
        if (paiement != null) {
            paiement.setInscription(this); // pour synchroniser la relation
        }
    }
}


