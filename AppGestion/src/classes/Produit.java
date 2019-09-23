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
public class Produit {
    private String categorie;
    private String codeProduit;
    private String designationProduit;
    private float prixAchat;
    private float prixVente;

    public Produit(String categorie, String codeProduit, String designationProduit, float prixAchat, float prixVente) {
        this.categorie = categorie;
        this.codeProduit = codeProduit;
        this.designationProduit = designationProduit;
        this.prixAchat = prixAchat;
        this.prixVente = prixVente;
    }
    

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getCodeProduit() {
        return codeProduit;
    }

    public void setCodeProduit(String codeProduit) {
        this.codeProduit = codeProduit;
    }

    public String getDesignationProduit() {
        return designationProduit;
    }

    public void setDesignationProduit(String designationProduit) {
        this.designationProduit = designationProduit;
    }

    public float getPrixAchat() {
        return prixAchat;
    }

    public void setPrixAchat(float prixAchat) {
        this.prixAchat = prixAchat;
    }

    public float getPrixVente() {
        return prixVente;
    }

    public void setPrixVente(float prixVente) {
        this.prixVente = prixVente;
    }
    
}
