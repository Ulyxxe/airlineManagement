package org.ulysse;

import java.time.LocalDate;

public class Vol {
    private int numeroVol;
    private String aeroportDepart;
    private String aeroportArrivee;
    private LocalDate dateDepart;
    private LocalDate dateArrivee;
    private String status;

    public Vol(int numeroVol, String aeroportDepart, String aeroportArrivee, LocalDate dateDepart, LocalDate dateArrivee){
        this.numeroVol = numeroVol;
        this.aeroportDepart = aeroportDepart;
        this.aeroportArrivee = aeroportArrivee;
        this.dateDepart = dateDepart;
        this.dateArrivee = dateArrivee;
        this.status = "à l'heure";
    }

    public void setNumeroVol(int numeroVol) {
        this.numeroVol = numeroVol;
    }
    public int getNumeroVol() {
        return numeroVol;
    }
    public String setAeroportDepart(String aeroportDepart) {
        return this.aeroportDepart = aeroportDepart;
    }
    public String getAeroportDepart() {
        return aeroportDepart;
    }
    public void setAeroportArrivee(String aeroportArrivee) {
        this.aeroportArrivee = aeroportArrivee;
    }
    public String getAeroportArrivee() {
        return aeroportArrivee;
    }
    public void setDateDepart(LocalDate dateDepart) {
        this.dateDepart = dateDepart;
    }
    public LocalDate getDateDepart() {
        return dateDepart;
    }
    public void setDateArrivee(LocalDate dateArrivee) {
        this.dateArrivee = dateArrivee;
    }
    public LocalDate getDateArrivee() {
        return dateArrivee;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getStatus() {
        return status;
    }
}
