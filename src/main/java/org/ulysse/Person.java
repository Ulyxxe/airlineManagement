package org.ulysse;

public class Person {
    private int identifiant;
    private String nom;
    private String adresse;
    private String contact;


    public Person (int identifiant, String nom, String adresse, String contact){
        this.identifiant = identifiant;
        this.nom = nom;
        this.adresse = adresse;
        this.contact = contact;

    }
    public int getIdentifiant() {
        return identifiant;
    }
    public void setIdentifiant(int identifiant) {
         this.identifiant = identifiant;
    }

    public String getNom() {
        return nom;
    }
    public void  setNom(String nom) {
       this.nom = nom;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    public String getAdresse() {
         return adresse;
    }

    public String getContact() {
        return contact;
    }
    public void setContact(String contact) {
       this.contact = contact;
    }

    public String getInfos(){
        return nom + " " + adresse + " " + contact;
    }
    public abstract getRole();
}
