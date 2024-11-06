package application;


import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class regController {

	// registrationfxml
	
    @FXML
    private AnchorPane anchorpane;

    @FXML
    private TextField nameField;

    @FXML
    private TextField idField;

    @FXML
    private TextField emailField;

    @FXML
    private TextField ageField;

    @FXML
    private TextField locationField;

    @FXML
    private TextField phoneField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private PasswordField confirmPasswordField;

    @FXML
    private RadioButton engineerRadio;

    @FXML
    private RadioButton customerRadio;

    @FXML
    private RadioButton workerRadio;
    
    // registrationfxml
    
    private Parent root;
    private Stage stage;
    private Scene scene;
    
    
    


    @FXML
    private Button nextButton;

    @FXML
    private void handleNext() throws IOException {
    	
        // Collect all the entered data
        String name = nameField.getText();
        String id = idField.getText();
        String email = emailField.getText();
        String age = ageField.getText();
        String location = locationField.getText();
        String phoneNumber = phoneField.getText();
        String password = passwordField.getText();
        String confirmPassword = confirmPasswordField.getText();
        
        
        
        
        

        
        String role = "";  // Customer or Engineer or Worker
        
        
        
        stage = (Stage) anchorpane.getScene().getWindow();
        
        // Get selected role
 
        if (engineerRadio.isSelected()) {
        	
           	
            role = "Engineer";
       	
			  FXMLLoader Loader = new FXMLLoader (getClass().getResource("Engineerreg.fxml"));
			  root= Loader.load();			  	  
			 // stage =(Stage)((Node)e.getSource()).getScene().getWindow();  // e : action event
			   scene = new Scene(root); 
			  stage.setTitle("Engineer Registration");
                     
        } 
        
        
        else if (customerRadio.isSelected()) {
        	
            role = "Customer";
        	
			  FXMLLoader Loader = new FXMLLoader (getClass().getResource("Customerreg.fxml"));
			  root= Loader.load();			  	  
			  scene = new Scene(root); 
			  stage.setTitle("Customer Registration");
        	
        	
        } 
        
        
        else if (workerRadio.isSelected()) {
            role = "Worker";
            
			  FXMLLoader Loader = new FXMLLoader (getClass().getResource("Workerreg.fxml"));
			  root= Loader.load();			  	  
			  scene = new Scene(root); 
			  stage.setTitle("Worker Registration");
            
            
        }

        // Validate fields 

        if (!password.equals(confirmPassword)) {
            System.out.println("Passwords do not match.");
            return;
        }
        
        if (name.isEmpty() || id.isEmpty() || email.isEmpty() || age.isEmpty() || location.isEmpty() || 
                phoneNumber.isEmpty() || password.isEmpty() || confirmPassword.isEmpty() || role.isEmpty()) {
                System.out.println("Please fill all fields.");
                return;
            }
        
        
        
        
        
        Main.setRegistrationData(name, id, email, age, location, phoneNumber, password);

        
        
        
        stage.setScene(scene);
        stage.show();
        
        
        

        // Display collected data for now (replace with actual registration logic)
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Email: " + email);
        System.out.println("Age: " + age);
        System.out.println("Location: " + location);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Role: " + role);
        System.out.println("Registration successful.");
    }
    
}






















































	
	


