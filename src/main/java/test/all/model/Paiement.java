package test.all.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "paiements")
public class Paiement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idpaiement;

    @Temporal(TemporalType.DATE)
    private Date datepaiement;

    private Float montant;
    private String moyenpaiement;

    @ManyToOne
    @JoinColumn(name = "idinscription")
    private Inscription inscription;

    // Getters et setters
    public Long getIdpaiement() { return idpaiement; }
    public void setIdpaiement(Long idpaiement) { this.idpaiement = idpaiement; }
    public Date getDatepaiement() { return datepaiement; }
    public void setDatepaiement(Date datepaiement) { this.datepaiement = datepaiement; }
    public Float getMontant() { return montant; }
    public void setMontant(Float montant) { this.montant = montant; }
    public String getMoyenpaiement() { return moyenpaiement; }
    public void setMoyenpaiement(String moyenpaiement) { this.moyenpaiement = moyenpaiement; }
    public Inscription getInscription() { return inscription; }
    public void setInscription(Inscription inscription) { this.inscription = inscription; }
}
