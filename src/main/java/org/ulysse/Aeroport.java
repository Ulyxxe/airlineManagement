package org.ulysse;

public class Aeroport {
    private String nom;
    private String ville;
    private String description;

    public Aeroport(String nom, String ville, String description){
        this.nom = nom;
        this.ville = ville;
        this.description = description;
    }
    public String getNom (String nom){
        return this.nom;
    }
    public void setNom (String nom){
        this.nom = nom;
    }
    public String getVille (String ville){
        return this.ville;
    }
    public void setVille (String ville){
        this.ville = ville;
    }
    public void setDescription (String description){
        this.description = description;
    }
    public String getDescription (String description){
        return this.description;
    }
}
