package test.all.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "emargements")
public class Emargement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idemargement;

    private Boolean present;

    @Temporal(TemporalType.DATE)
    private Date date;

    @ManyToOne
    @JoinColumn(name = "idutilisateur")
    private Utilisateur utilisateur;

    @ManyToOne
    @JoinColumn(name = "idsession")
    private Session session;

    // Getters et setters
    public Long getIdemargement() { return idemargement; }
    public void setIdemargement(Long idemargement) { this.idemargement = idemargement; }
    public Boolean getPresent() { return present; }
    public void setPresent(Boolean present) { this.present = present; }
    public Date getDate() { return date; }
    public void setDate(Date date) { this.date = date; }
    public Utilisateur getUtilisateur() { return utilisateur; }
    public void setUtilisateur(Utilisateur utilisateur) { this.utilisateur = utilisateur; }
    public Session getSession() { return session; }
    public void setSession(Session session) { this.session = session; }
}
