package test.all.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "paiements")
public class Paiement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idpaiement;

    private LocalDate datePaiement;
    private Double montantPaiement;

    // Relation avec Inscription (chaque paiement correspond à une inscription)
    @OneToOne
    @JoinColumn(name = "idinscription", nullable = false, unique = true)
    private Inscription inscription;

    public Paiement() {}

    public Paiement(Long idpaiement, LocalDate datePaiement, Double montantPaiement, Inscription inscription) {
        this.idpaiement = idpaiement;
        this.datePaiement = datePaiement;
        this.montantPaiement = montantPaiement;
        this.inscription = inscription;
    }

    // Getters et setters
    public Long getIdpaiement() {
        return idpaiement;
    }

    public void setIdpaiement(Long idpaiement) {
        this.idpaiement = idpaiement;
    }

    public LocalDate getDatePaiement() {
        return datePaiement;
    }

    public void setDatePaiement(LocalDate datePaiement) {
        this.datePaiement = datePaiement;
    }

    public Double getMontantPaiement() {
        return montantPaiement;
    }

    public void setMontantPaiement(Double montantPaiement) {
        this.montantPaiement = montantPaiement;
    }

    public Inscription getInscription() {
        return inscription;
    }

    public void setInscription(Inscription inscription) {
        this.inscription = inscription;
    }
}
