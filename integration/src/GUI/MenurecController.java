/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author dell
 */
public class MenurecController implements Initializable {

    @FXML
    private Button btnrec;
    @FXML
    private Button btncat;
    @FXML
    private Button btnacceuil;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void ouvrirrec(ActionEvent event) throws IOException {
   FXMLLoader loader= new FXMLLoader(getClass().getResource("Afficher_rec.fxml"));
       
       Parent root = (Parent)loader.load();
        
        
        Afficher_recController ap= loader.getController();
        btnrec.getScene().setRoot(root);
    }

    @FXML
    private void ouvrircat(ActionEvent event) throws IOException {
    FXMLLoader loader= new FXMLLoader(getClass().getResource("afficherCat.fxml"));
       
       Parent root = (Parent)loader.load();
        
        
        AfficherCatController ap= loader.getController();
        btncat.getScene().setRoot(root);
    }

    @FXML
    private void acceuil(ActionEvent event) throws IOException {
        FXMLLoader loader= new FXMLLoader(getClass().getResource("acceuilResponsable.fxml"));
       
       Parent root = (Parent)loader.load();
        
        
        AcceuilResponsableController ap= loader.getController();
        btnacceuil.getScene().setRoot(root);
    }

    
    
}
