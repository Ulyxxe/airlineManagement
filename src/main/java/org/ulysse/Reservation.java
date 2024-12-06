package org.ulysse;

import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;

public class Reservation {
    private int numeroReservation;
    private LocalDateTime dateReservation;
    private String status;
    private List<Vol> volreservees;

    public Reservation(int numeroReservation){
        this.numeroReservation = numeroReservation;
        this.dateReservation = LocalDateTime.now();
        this.status = "unconfirmed";
        this.volreservees = new ArrayList<>();
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public String getStatus() {
        return status;
    }


    public LocalDateTime getDateReservation() {
        return dateReservation;
    }

    public int getReservation(){
        return numeroReservation;
    }

    public void bookVol(Vol vol){
        volreservees.add(vol);
    }
    public void annulerReservation(Reservation reservation ){

    }
}




