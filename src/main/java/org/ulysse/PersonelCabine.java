package org.ulysse;

public class PersonelCabine extends Employee{
    private String qualification;

    public PersonelCabine(int numeroEmployee, int numeroPersonnel, String nom, String adresse, String contact, String dateEmbauche, String qualification){
        super(numeroEmployee, numeroPersonnel, nom, adresse, contact, dateEmbauche);
        this.qualification = qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
    public String getQualification() {
        return qualification;
    }
}
