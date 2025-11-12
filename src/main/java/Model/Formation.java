package Model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Formation {

    @Id
    @GeneratedValue
    private Long idformation;
    private String nom;
    private float tarif;
    private float duree;

    @ManyToOne
    @JoinColumn(name = "idcategorie")
    private Categorie categorie;

    @OneToMany(mappedBy = "formation")
    private List<Session> sessions;

    public Formation() {}

    public Formation(Long idformation, String nom, float tarif, float duree, Categorie categorie) {
        this.idformation = idformation;
        this.nom = nom;
        this.tarif = tarif;
        this.duree = duree;
        this.categorie = categorie;
    }

    public Long getIdformation() { return idformation; }
    public void setIdformation(Long idformation) { this.idformation = idformation; }
    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }
    public float getTarif() { return tarif; }
    public void setTarif(float tarif) { this.tarif = tarif; }
    public float getDuree() { return duree; }
    public void setDuree(float duree) { this.duree = duree; }
    public Categorie getCategorie() { return categorie; }
    public void setCategorie(Categorie categorie) { this.categorie = categorie; }
}
