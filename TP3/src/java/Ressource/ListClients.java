/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ressource;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jonathan
 */
public class ListClients {
    private List<Client> ListeCli;
    
    
    public ListClients() {
        this.ListeCli = new ArrayList();
    }
    public ListClients(List<Client> ListeCli) {
        this.ListeCli = ListeCli;
    }
    
    
    public void ajouterClientdansListe(Client c){
        this.ListeCli.add(c);
    }
    
    
    public void modifierClient(Client c, int i){
        this.ListeCli.set(i, c);
    }
    
    public String consulterClient(int i){
        return this.ListeCli.get(i).toString();
    }
    
    public String consulterListeClient(){
        String ans = "";
        for(int i = 0; i< this.ListeCli.size(); i++){
             ans += this.ListeCli.get(i).toString() ;
        }
        return ans;
    }
    
    
    public void supprimerClient(int i){
        this.ListeCli.remove(i);
    }

    @Override
    public String toString() {
        return "ListClients{" + "ListeCli=" + ListeCli + '}';
    }
    
    
    
}
