package application;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

	public class Controller {

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

		
		  @FXML private void handleLogin(ActionEvent e)
		  { 
			  
			  String id = idField.getText(); 
			  String password = passwordField.getText();
			  
			  
		  
		  // Implement your login logic here
		  System.out.println("ID: " + id + ", Password: " + password); 
		  }
		  
		  @FXML 
		  private void handleRegister(ActionEvent e) throws IOException { // Implement registration logic here 
		  System.out.println("Registration clicked"); 
		  
				  FXMLLoader Loader = new FXMLLoader (getClass().getResource("registration.fxml"));
				  root= Loader.load();
				  stage =(Stage)((Node)e.getSource()).getScene().getWindow();
				  Scene scene = new Scene(root); 
				  stage.setTitle("Registration");
				  stage.setScene(scene); stage.show();
				 
			        }
				  			 
		  
		  
		  
		  }  
		   
	


