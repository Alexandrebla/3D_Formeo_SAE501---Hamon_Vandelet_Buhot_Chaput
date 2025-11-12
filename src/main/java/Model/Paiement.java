package Model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Paiement {

    @Id
    @GeneratedValue
    private Long idpaiement;
    private Date datepaiement;
    private float montant;
    private String moyenpaiement;

    @OneToOne
    @JoinColumn(name = "idinscription")
    private Inscription inscription;

    public Paiement() {}

    public Paiement(Long idpaiement, Date datepaiement, float montant, String moyenpaiement, Inscription inscription) {
        this.idpaiement = idpaiement;
        this.datepaiement = datepaiement;
        this.montant = montant;
        this.moyenpaiement = moyenpaiement;
        this.inscription = inscription;
    }

    public Long getIdpaiement() { return idpaiement; }
    public void setIdpaiement(Long idpaiement) { this.idpaiement = idpaiement; }
    public Date getDatepaiement() { return datepaiement; }
    public void setDatepaiement(Date datepaiement) { this.datepaiement = datepaiement; }
    public float getMontant() { return montant; }
    public void setMontant(float montant) { this.montant = montant; }
    public String getMoyenpaiement() { return moyenpaiement; }
    public void setMoyenpaiement(String moyenpaiement) { this.moyenpaiement = moyenpaiement; }
    public Inscription getInscription() { return inscription; }
    public void setInscription(Inscription inscription) { this.inscription = inscription; }
}
