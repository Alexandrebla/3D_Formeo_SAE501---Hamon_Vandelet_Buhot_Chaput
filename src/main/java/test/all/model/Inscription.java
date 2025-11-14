package test.all.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "inscriptions")
public class Inscription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idinscription;

    @Temporal(TemporalType.DATE)
    private Date dateinscription;

    private Boolean statutpaiement;

    @ManyToOne
    @JoinColumn(name = "idformation")
    private Formation formation;

    @ManyToOne
    @JoinColumn(name = "idutilisateur")
    private Utilisateur utilisateur;

    // Getters et setters
    public Long getIdinscription() { return idinscription; }
    public void setIdinscription(Long idinscription) { this.idinscription = idinscription; }
    public Date getDateinscription() { return dateinscription; }
    public void setDateinscription(Date dateinscription) { this.dateinscription = dateinscription; }
    public Boolean getStatutpaiement() { return statutpaiement; }
    public void setStatutpaiement(Boolean statutpaiement) { this.statutpaiement = statutpaiement; }
    public Formation getFormation() { return formation; }
    public void setFormation(Formation formation) { this.formation = formation; }
    public Utilisateur getUtilisateur() { return utilisateur; }
    public void setUtilisateur(Utilisateur utilisateur) { this.utilisateur = utilisateur; }
}
