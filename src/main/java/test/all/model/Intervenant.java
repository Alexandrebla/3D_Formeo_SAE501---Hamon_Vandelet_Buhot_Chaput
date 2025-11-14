package test.all.model;

import jakarta.persistence.*;

@Entity
@Table(name = "intervenants")
public class Intervenant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idintervenant;

    private String nom;
    private String prenom;
    private String specialite;
    private String coordonnees;
    private String statut;
    private String nbheures;

    // Getters et setters
    public Long getIdintervenant() { return idintervenant; }
    public void setIdintervenant(Long idintervenant) { this.idintervenant = idintervenant; }
    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }
    public String getPrenom() { return prenom; }
    public void setPrenom(String prenom) { this.prenom = prenom; }
    public String getSpecialite() { return specialite; }
    public void setSpecialite(String specialite) { this.specialite = specialite; }
    public String getCoordonnees() { return coordonnees; }
    public void setCoordonnees(String coordonnees) { this.coordonnees = coordonnees; }
    public String getStatut() { return statut; }
    public void setStatut(String statut) { this.statut = statut; }
    public String getNbheures() { return nbheures; }
    public void setNbheures(String nbheures) { this.nbheures = nbheures; }
}
