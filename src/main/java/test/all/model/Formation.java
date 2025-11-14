package test.all.model;

import jakarta.persistence.*;

@Entity
@Table(name = "formations")
public class Formation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idformation;

    private String nom;
    private Float tarif;
    private String duree;

    @ManyToOne
    @JoinColumn(name = "idcategorie")
    private Categorie categorie;

    // Getters et setters
    public Long getIdformation() { return idformation; }
    public void setIdformation(Long idformation) { this.idformation = idformation; }
    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }
    public Float getTarif() { return tarif; }
    public void setTarif(Float tarif) { this.tarif = tarif; }
    public String getDuree() { return duree; }
    public void setDuree(String duree) { this.duree = duree; }
    public Categorie getCategorie() { return categorie; }
    public void setCategorie(Categorie categorie) { this.categorie = categorie; }
}
