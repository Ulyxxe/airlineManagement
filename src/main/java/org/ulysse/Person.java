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
    public int setIdentifiant(int identifiant) {
        return this.identifiant = identifiant;
    }

    public String getNom() {
        return nom;
    }
    public String setNom(String nom) {
        return this.nom = nom;
    }
    public String setAdresse(String adresse) {
        return this.adresse = adresse;
    }
    public String setContact(String contact) {
        return this.contact = contact;
    }
    public String getAdresse() {
        return adresse;
    }
    public String getContact() {
        return contact;
    }


}
