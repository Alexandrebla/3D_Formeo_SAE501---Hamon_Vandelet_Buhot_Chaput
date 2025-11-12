package Model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Categorie {

    @Id
    @GeneratedValue
    private Long idcategorie;
    private String nom;

    @OneToMany(mappedBy = "categorie")
    private List<Formation> formations;

    public Categorie() {}

    public Categorie(Long idcategorie, String nom) {
        this.idcategorie = idcategorie;
        this.nom = nom;
    }

    public Long getIdcategorie() { return idcategorie; }
    public void setIdcategorie(Long idcategorie) { this.idcategorie = idcategorie; }
    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }
}
