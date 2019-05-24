/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmi;

import java.net.URL;
import java.text.DecimalFormat;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 *
 * @author ahashmi
 */
public class BmiController implements Initializable {
    
    @FXML
    private Button button;

    @FXML
    private TextField heightinch;

    @FXML
    private TextField bmiid;

    @FXML
    private TextField heightfeet;

    @FXML
    private TextField wightslbs;

    /**
     *
     * @param event
     */
   public void handleButtonAction(ActionEvent event) {
double weight=Double.parseDouble(wightslbs.getText());
double feet=Double.parseDouble(heightfeet.getText());
double inch=Double.parseDouble(heightinch.getText());

double actualHeight=(feet*0.3048)+(inch*0.0254);

double bmi= (weight)/(actualHeight*actualHeight);
DecimalFormat df=new DecimalFormat("#.00"); 
bmiid.setText(String.valueOf(df.format(bmi)));


    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }    
    
}
