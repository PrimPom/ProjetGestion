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
public class Magasin {
    private String nomMagasin;
    private String DepartementMagasin;

    public String getNomMagasin() {
        return nomMagasin;
    }

    public void setNomMagasin(String nomMagasin) {
        this.nomMagasin = nomMagasin;
    }

    public String getDepartementMagasin() {
        return DepartementMagasin;
    }

    public void setDepartementMagasin(String DepartementMagasin) {
        this.DepartementMagasin = DepartementMagasin;
    }

    public Magasin(String nomMagasin, String DepartementMagasin) {
        this.nomMagasin = nomMagasin;
        this.DepartementMagasin = DepartementMagasin;
    }
    
}
