/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author primp
 */
public class Fournisseur {
    private String nomForunisseur;

    public Fournisseur(String nomForunisseur) {
        this.nomForunisseur = nomForunisseur;
    }
    

    public String getNomForunisseur() {
        return nomForunisseur;
    }

    public void setNomForunisseur(String nomForunisseur) {
        this.nomForunisseur = nomForunisseur;
    }
    
}
