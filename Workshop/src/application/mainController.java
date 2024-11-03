package application;





import java.io.IOException;

import javafx.beans.value.ChangeListener;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

	public class mainController {

	    @FXML
	    private TextField idField;

	    @FXML
	    private PasswordField passwordField;

	    @FXML
	    private Button loginButton;

	    @FXML
	    private Button registerButton;
	    //

	   

	    //
	    
	    
		Parent root;
		Stage stage;
		FXMLLoader Loader;
		
		
		  @FXML private void handleLogin(ActionEvent e) throws IOException {
		  
		  String id = idField.getText(); String password = passwordField.getText();
		  
		  
		  // فحص للباسورد
		  
		  
		  
		  Loader = new FXMLLoader(getClass().getResource("Admin.fxml")); Parent root =
		  Loader.load();
		  
		  // Create a new Group and add the loaded root node to it 
	//	  Group groupRoot =  new Group();
	//	  groupRoot.getChildren().add(root);
		  
		  
		  // Set up the new Scene with the Group as root
		  stage = (Stage) ((Node)e.getSource()).getScene().getWindow();
		  Scene scene = new Scene(root);
		  stage.setScene(scene); stage.show();
		  

		  }	
		
		
		
		
		  
		  @FXML 
		  private void handleRegister(ActionEvent e) throws IOException { // Implement registration logic here 
		  System.out.println("Registration clicked"); 
		  
				  Loader = new FXMLLoader (getClass().getResource("registration.fxml"));
				  root= Loader.load();
				  stage =(Stage)((Node)e.getSource()).getScene().getWindow();
				  Scene scene = new Scene(root); 
				  stage.setTitle("Registration");
				  stage.setScene(scene); stage.show();
				 
			        }
				  			 
		  
		  
		  
		  }  
		   
	


