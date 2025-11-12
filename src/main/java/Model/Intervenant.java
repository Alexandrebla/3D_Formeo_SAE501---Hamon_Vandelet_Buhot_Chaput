package Model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Intervenant {

    @Id
    @GeneratedValue
    private Long idintervenant;
    private String nom;
    private String prenom;
    private String specialite;
    private String coordonnees;
    private String statut;

    @OneToMany(mappedBy = "intervenant")
    private List<Session> sessions;

    public Intervenant() {}

    public Intervenant(Long idintervenant, String nom, String prenom, String specialite, String coordonnees, String statut) {
        this.idintervenant = idintervenant;
        this.nom = nom;
        this.prenom = prenom;
        this.specialite = specialite;
        this.coordonnees = coordonnees;
        this.statut = statut;
    }

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
}
