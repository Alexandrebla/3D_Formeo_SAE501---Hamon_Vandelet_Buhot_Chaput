package test.all.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "sessions")
public class Session {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idsession;

    @Temporal(TemporalType.DATE)
    private Date datedebut;

    @Temporal(TemporalType.DATE)
    private Date datefin;

    private String lieu;
    private Integer nplaces;
    private Integer numerosalle;

    @ManyToOne
    @JoinColumn(name = "idformation")
    private Formation formation;

    @ManyToOne
    @JoinColumn(name = "idintervenant")
    private Intervenant intervenant;

    // Getters et setters
    public Long getIdsession() { return idsession; }
    public void setIdsession(Long idsession) { this.idsession = idsession; }
    public Date getDatedebut() { return datedebut; }
    public void setDatedebut(Date datedebut) { this.datedebut = datedebut; }
    public Date getDatefin() { return datefin; }
    public void setDatefin(Date datefin) { this.datefin = datefin; }
    public String getLieu() { return lieu; }
    public void setLieu(String lieu) { this.lieu = lieu; }
    public Integer getNplaces() { return nplaces; }
    public void setNplaces(Integer nplaces) { this.nplaces = nplaces; }
    public Integer getNumerosalle() { return numerosalle; }
    public void setNumerosalle(Integer numerosalle) { this.numerosalle = numerosalle; }
    public Formation getFormation() { return formation; }
    public void setFormation(Formation formation) { this.formation = formation; }
    public Intervenant getIntervenant() { return intervenant; }
    public void setIntervenant(Intervenant intervenant) { this.intervenant = intervenant; }
}
