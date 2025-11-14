package test.all.model;

import jakarta.persistence.*;

@Entity
@Table(name = "categories")
public class Categorie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idcategorie;
    private String nom;

    // Getters et setters
    public Long getIdcategorie() { return idcategorie; }
    public void setIdcategorie(Long idcategorie) { this.idcategorie = idcategorie; }
    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }
}
