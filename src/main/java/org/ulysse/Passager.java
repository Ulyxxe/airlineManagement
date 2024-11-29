package org.ulysse;

public class Passager extends Person{
    private String passeport;

    public Passager(int numeroPassager, String nom, String adresse, String contact, String passeport){
        super(numeroPassager, nom, adresse, contact);
        this.passeport = passeport;
    }


    public void setPasseport(java.lang.String passeport) {
        this.passeport = passeport;
    }
    public String getPasseport() {
        return passeport;
    }
}
