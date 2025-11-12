package Model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Emargement {

    @Id
    @GeneratedValue
    private Long idemargement;
    private boolean present;
    private Date date;

    @ManyToOne
    @JoinColumn(name = "idutilisateur")
    private Utilisateur utilisateur;

    @ManyToOne
    @JoinColumn(name = "idsession")
    private Session session;

    public Emargement() {}

    public Emargement(Long idemargement, boolean present, Date date, Utilisateur utilisateur, Session session) {
        this.idemargement = idemargement;
        this.present = present;
        this.date = date;
        this.utilisateur = utilisateur;
        this.session = session;
    }

    public Long getIdemargement() { return idemargement; }
    public void setIdemargement(Long idemargement) { this.idemargement = idemargement; }
    public boolean isPresent() { return present; }
    public void setPresent(boolean present) { this.present = present; }
    public Date getDate() { return date; }
    public void setDate(Date date) { this.date = date; }
    public Utilisateur getUtilisateur() { return utilisateur; }
    public void setUtilisateur(Utilisateur utilisateur) { this.utilisateur = utilisateur; }
    public Session getSession() { return session; }
    public void setSession(Session session) { this.session = session; }
}
