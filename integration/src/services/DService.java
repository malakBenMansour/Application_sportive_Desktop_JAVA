/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.List;
import entities.Commande;
/**
 *
 * @author dhiabensaada
 */
public interface DService<T> {
    public void ajouterpst(T t);
    public void supprimer(int id);
    public void modifier(int id_amodifier,T modifier);
    public List<T> afficher();
    public List<T> afficherById(int id);
   
}