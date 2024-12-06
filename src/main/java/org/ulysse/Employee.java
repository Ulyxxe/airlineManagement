package org.ulysse;

public class Employee extends Person {
     private int numeroEmployee;
     private String dateEmbauche;

     public Employee(int identifiant, int numeroEmployee, String nom, String adresse, String contact, String dateEmbauche){
         super(numeroEmployee, nom, adresse, contact);
         this.numeroEmployee = numeroEmployee;
         this.dateEmbauche = dateEmbauche;
     }

    public void setNumeroEmployee(int numeroEmployee) {
            this.numeroEmployee = numeroEmployee;
    }
    public int getNumeroEmployee() {
         return numeroEmployee;
    }

    public void setDateEmbauche(String dateEmbauche) {
         this.dateEmbauche = dateEmbauche;
    }
    public String getDateEmbauche() {
         return dateEmbauche;
    }

    @Override
    public String getRole(){
        return "Employee";
    }
}

