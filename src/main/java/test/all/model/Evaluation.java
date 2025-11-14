package test.all.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "evaluations")
public class Evaluation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idevaluation;

    private Float note;

    @Temporal(TemporalType.DATE)
    private Date date;

    @ManyToOne
    @JoinColumn(name = "idutilisateur")
    private Utilisateur utilisateur;

    // Getters et setters
    public Long getIdevaluation() { return idevaluation; }
    public void setIdevaluation(Long idevaluation) { this.idevaluation = idevaluation; }
    public Float getNote() { return note; }
    public void setNote(Float note) { this.note = note; }
    public Date getDate() { return date; }
    public void setDate(Date date) { this.date = date; }
    public Utilisateur getUtilisateur() { return utilisateur; }
    public void setUtilisateur(Utilisateur utilisateur) { this.utilisateur = utilisateur; }
}
