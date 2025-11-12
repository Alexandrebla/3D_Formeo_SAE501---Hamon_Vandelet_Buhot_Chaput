package Model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Inscription {

    @Id
    @GeneratedValue
    private Long idinscription;
    private Date dateinscription;
    private boolean statutpaiement;

    @ManyToOne
    @JoinColumn(name = "idformation")
    private Formation formation;

    @ManyToOne
    @JoinColumn(name = "idutilisateur")
    private Utilisateur utilisateur;

    @OneToOne(mappedBy = "inscription")
    private Paiement paiement;

    public Inscription() {}

    public Inscription(Long idinscription, Date dateinscription, boolean statutpaiement, Formation formation, Utilisateur utilisateur) {
        this.idinscription = idinscription;
        this.dateinscription = dateinscription;
        this.statutpaiement = statutpaiement;
        this.formation = formation;
        this.utilisateur = utilisateur;
    }

    public Long getIdinscription() { return idinscription; }
    public void setIdinscription(Long idinscription) { this.idinscription = idinscription; }
    public Date getDateinscription() { return dateinscription; }
    public void setDateinscription(Date dateinscription) { this.dateinscription = dateinscription; }
    public boolean isStatutpaiement() { return statutpaiement; }
    public void setStatutpaiement(boolean statutpaiement) { this.statutpaiement = statutpaiement; }
    public Formation getFormation() { return formation; }
    public void setFormation(Formation formation) { this.formation = formation; }
    public Utilisateur getUtilisateur() { return utilisateur; }
    public void setUtilisateur(Utilisateur utilisateur) { this.utilisateur = utilisateur; }
    public Paiement getPaiement() { return paiement; }
    public void setPaiement(Paiement paiement) { this.paiement = paiement; }
}
