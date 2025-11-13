package test.all.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "sessions")
public class Session {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idsession;

    private LocalDate dateDebut;
    private LocalDate dateFin;
    private String lieu;
    private Integer nPlaces;
    private String numeroSalle;


    @ManyToOne
    @JoinColumn(name = "idformation", nullable = false)
    private Formation formation;


    @ManyToOne
    @JoinColumn(name = "idintervenant", nullable = false)
    private Intervenant intervenant;

    
    @OneToMany(mappedBy = "session", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Emargement> emargements = new ArrayList<>();

    public Session() {}

    public Session(Long idsession, LocalDate dateDebut, LocalDate dateFin, String lieu,
                   Integer nPlaces, String numeroSalle, Formation formation, Intervenant intervenant) {
        this.idsession = idsession;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.lieu = lieu;
        this.nPlaces = nPlaces;
        this.numeroSalle = numeroSalle;
        this.formation = formation;
        this.intervenant = intervenant;
    }


    public Long getIdsession() {
        return idsession;
    }

    public void setIdsession(Long idsession) {
        this.idsession = idsession;
    }

    public LocalDate getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(LocalDate dateDebut) {
        this.dateDebut = dateDebut;
    }

    public LocalDate getDateFin() {
        return dateFin;
    }

    public void setDateFin(LocalDate dateFin) {
        this.dateFin = dateFin;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public Integer getnPlaces() {
        return nPlaces;
    }

    public void setnPlaces(Integer nPlaces) {
        this.nPlaces = nPlaces;
    }

    public String getNumeroSalle() {
        return numeroSalle;
    }

    public void setNumeroSalle(String numeroSalle) {
        this.numeroSalle = numeroSalle;
    }

    public Formation getFormation() {
        return formation;
    }

    public void setFormation(Formation formation) {
        this.formation = formation;
    }

    public Intervenant getIntervenant() {
        return intervenant;
    }

    public void setIntervenant(Intervenant intervenant) {
        this.intervenant = intervenant;
    }

    public List<Emargement> getEmargements() {
        return emargements;
    }

    public void setEmargements(List<Emargement> emargements) {
        this.emargements = emargements;
    }




    public void ajouter() {
        if (formation != null) {
            System.out.println("Session ajoutée à la formation : " + formation.getTitre());
        }
    }


    public void supprimer() {
        System.out.println("Session supprimée : " + this.idsession);
    }


    public void inscrire(Utilisateur utilisateur) {
        System.out.println("Utilisateur " + utilisateur.getNom() + " inscrit à la session " + this.idsession);
    }


    public void supprimerInscription(Utilisateur utilisateur) {
        System.out.println("Inscription supprimée pour " + utilisateur.getNom() + " dans la session " + this.idsession);
    }


    public void emarger(Utilisateur utilisateur, boolean present) {
        Emargement emargement = new Emargement();
        emargement.setUtilisateur(utilisateur);
        emargement.setSession(this);
        emargement.setDate(LocalDate.now());
        emargement.setPresent(present);
        emargements.add(emargement);
        System.out.println("Présence enregistrée pour " + utilisateur.getNom());
    }


    public void noter(Utilisateur utilisateur, double note) {
        Evaluation evaluation = new Evaluation();
        evaluation.setUtilisateur(utilisateur);
        evaluation.setFormation(this.formation);
        evaluation.setNote(note);
        evaluation.setDate(LocalDate.now());
        System.out.println("Note attribuée à " + utilisateur.getNom() + " : " + note);
    }
}

