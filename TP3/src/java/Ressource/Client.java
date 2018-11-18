/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ressource;

/**
 *
 * @author Jonathan
 */

public class Client {
    
    private String nom;
    private String Prenom;
    
    
    
    public Client() {
    }
    
    public Client(String nom, String Prenom) {
        this.nom = nom;
        this.Prenom = Prenom;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String Prenom) {
        this.Prenom = Prenom;
    }

    @Override
    public String toString() {
        return "Client{" + "nom=" + nom + ", Prenom=" + Prenom + '}';
    }
    
    
    
}
