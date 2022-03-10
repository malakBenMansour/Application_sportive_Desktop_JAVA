/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author dhiabensaada
 */
public class Magasin {
      private int idm ;
       private String nom ;
          private String adresse ;
          private int nombrebloc ;
          private int idps;

    public Magasin() {
    }

    public Magasin(int idm, String nom, String adresse, int nombrebloc,int idps) {
        this.idm = idm;
        this.nom = nom;
        this.adresse = adresse;
        this.nombrebloc = nombrebloc;
        this.idps=idps;
    }

    public Magasin(String nom, String adresse, int nombrebloc,int idps) {
        this.nom = nom;
        this.adresse = adresse;
        this.nombrebloc = nombrebloc;
        this.idps=idps;
    }

    public int getIdm() {
        return idm;
    }

    public void setIdm(int idm) {
        this.idm = idm;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getNombrebloc() {
        return nombrebloc;
    }

    public void setNombrebloc(int nombrebloc) {
        this.nombrebloc = nombrebloc;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + this.idm;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Magasin other = (Magasin) obj;
        if (this.idm != other.idm) {
            return false;
        }
        return true;
    }

    public int getIdps() {
        return idps;
    }

    public void setIdps(int idps) {
        this.idps = idps;
    }

    @Override
    public String toString() {
        return "Magasin{" + "idm=" + idm + ", nom=" + nom + ", adresse=" + adresse + ", nombrebloc=" + nombrebloc + ", idps=" + idps + '}';
    }

    
          
}