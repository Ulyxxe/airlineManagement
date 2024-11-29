package org.ulysse;

public class Pilote extends Employee{
    private String licence;
    private int heureDeVol;

    public Pilote(int numeroEmployee, int numeroPassager, String nom, String adresse, String contact, String dateEmbauche, String licence, int heureDeVol){
        super(numeroEmployee, numeroPassager, nom, adresse, contact, dateEmbauche);
        this.licence = licence;
        this.heureDeVol = heureDeVol;
    }

    public void setLicence(String licence){
        this.licence = licence;
    }
    public String getLicence(){
        return licence;
    }

    public void setHeureDeVol(int heureDeVol){
        this.heureDeVol = heureDeVol;
    }
    public int getHeureDeVol(){
        return heureDeVol;
    }
}
