package org.ulysse;

public class Pilote extends Employee{
    private String licence;

    public Pilote(int numeroEmployee, int numeroPassager, String nom, String adresse, String contact, String dateEmbauche, String licence){
        super(numeroEmployee, numeroPassager, nom, adresse, contact, dateEmbauche);
        this.licence = licence;
    }

    public void setLicence(String licence){
        this.licence = licence;
    }
    public String getLicence(){
        return licence;
    }
}
