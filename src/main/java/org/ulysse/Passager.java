package org.ulysse;

import java.util.ArrayList;
import java.util.List;

public class Passager extends Person{
    private String passeport;
    private List<Integer> reservationIds;

    public Passager(int numeroPassager, String nom, String adresse, String contact, String passeport){
        super(numeroPassager, nom, adresse, contact);
        this.passeport = passeport;
        this.reservationIds = new ArrayList<>();
    }


    public void setPasseport(java.lang.String passeport) {
        this.passeport = passeport;
    }
    public String getPasseport() {
        return passeport;
    }
    @Override
    public String getRole(){
        return "Passager";
    }
}
