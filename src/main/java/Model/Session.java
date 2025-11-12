package Model;

import jakarta.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Session {

    @Id
    @GeneratedValue
    private Long idsession;
    private Date datedebut;
    private Date datefin;
    private String lieu;
    private int nplaces;

    @ManyToOne
    @JoinColumn(name = "idformation")
    private Formation formation;

    @ManyToOne
    @JoinColumn(name = "idintervenant")
    private Intervenant intervenant;

    @OneToMany(mappedBy = "session")
    private List<Emargement> emargements;

    public Session() {}

    public Session(Long idsession, Date datedebut, Date datefin, String lieu, int nplaces, Formation formation, Intervenant intervenant) {
        this.idsession = idsession;
        this.datedebut = datedebut;
        this.datefin = datefin;
        this.lieu = lieu;
        this.nplaces = nplaces;
        this.formation = formation;
        this.intervenant = intervenant;
    }

    public Long getIdsession() { return idsession; }
    public void setIdsession(Long idsession) { this.idsession = idsession; }
    public Date getDatedebut() { return datedebut; }
    public void setDatedebut(Date datedebut) { this.datedebut = datedebut; }
    public Date getDatefin() { return datefin; }
    public void setDatefin(Date datefin) { this.datefin = datefin; }
    public String getLieu() { return lieu; }
    public void setLieu(String lieu) { this.lieu = lieu; }
    public int getNplaces() { return nplaces; }
    public void setNplaces(int nplaces) { this.nplaces = nplaces; }
    public Formation getFormation() { return formation; }
    public void setFormation(Formation formation) { this.formation = formation; }
    public Intervenant getIntervenant() { return intervenant; }
    public void setIntervenant(Intervenant intervenant) { this.intervenant = intervenant; }
}
