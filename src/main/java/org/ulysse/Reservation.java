package org.ulysse;

import java.time.LocalDateTime;

public class Reservation {
    private int numeroReservation;
    private LocalDateTime dateReservation;
    private String status;

    public Reservation(int numeroReservation){
        this.numeroReservation = numeroReservation;
        this.dateReservation = LocalDateTime.now();
        this.status = "unconfirmed";
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
}




