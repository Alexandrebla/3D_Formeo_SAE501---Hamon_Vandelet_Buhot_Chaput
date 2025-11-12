package Model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Evaluation {

    @Id
    @GeneratedValue
    private Long idevaluation;
    private float note;
    private Date date;

    @ManyToOne
    @JoinColumn(name = "idutilisateur")
    private Utilisateur utilisateur;

    public Evaluation() {}

    public Evaluation(Long idevaluation, float note, Date date, Utilisateur utilisateur) {
        this.idevaluation = idevaluation;
        this.note = note;
        this.date = date;
        this.utilisateur = utilisateur;
    }

    public Long getIdevaluation() { return idevaluation; }
    public void setIdevaluation(Long idevaluation) { this.idevaluation = idevaluation; }
    public float getNote() { return note; }
    public void setNote(float note) { this.note = note; }
    public Date getDate() { return date; }
    public void setDate(Date date) { this.date = date; }
    public Utilisateur getUtilisateur() { return utilisateur; }
    public void setUtilisateur(Utilisateur utilisateur) { this.utilisateur = utilisateur; }
}
