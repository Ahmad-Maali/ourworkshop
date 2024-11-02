package application;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

//import javafx.scene.control.ToggleGroup;
import javafx.event.ActionEvent;

public class cusController {

    // FXML annotations link GUI elements to this controller
    @FXML
    private RadioButton radioMale;

    @FXML
    private RadioButton radioFemale;

    @FXML
    private TextArea txtFinancialCapacity;

    @FXML
    private TextArea txtDescription;

    @FXML
    private TextField txtProjectName;

    @FXML
    private TextField txtLocation;

    @FXML
    private Button btnFinishRequest;
    
    
    @FXML
    private AnchorPane anchorpane;
    private Parent root;
    private Stage stage;
    private Scene scene;
    
    

   // private ToggleGroup genderGroup; // Toggle group for gender selection

    // Initialize method called by JavaFX after FXML is loaded
    @FXML
   /* public void initialize() {
        // Set up the ToggleGroup for the radio buttons
        genderGroup = new ToggleGroup();
        radioMale.setToggleGroup(genderGroup);
        radioFemale.setToggleGroup(genderGroup);

        // Optional: Set a default value for gender
        radioMale.setSelected(true);

        // Attach an event handler to the button
        btnFinishRequest.setOnAction(this::handleFinishRequest);
    }

*/



    // Event handler for the Finish Request button
    private void handleFinishRequest(ActionEvent event) throws IOException {
        // Gather input data
        String gender = radioMale.isSelected() ? "Male" : "Female";
        String financialCapacity = txtFinancialCapacity.getText().trim();
        String description = txtDescription.getText().trim();
        String projectName = txtProjectName.getText().trim();
        String location = txtLocation.getText().trim();

        // Validation (optional)
        if (financialCapacity.isEmpty() || description.isEmpty() || projectName.isEmpty() || location.isEmpty()) {
            System.out.println("All fields must be filled out.");
            return;
        }

        // Process the data (e.g., save to a database, send to a server, etc.)
        System.out.println("Gender: " + gender);
        System.out.println("Financial Capacity: " + financialCapacity);
        System.out.println("Description: " + description);
        System.out.println("Project Name: " + projectName);
        System.out.println("Location: " + location);
        
        
        
        // Display the collected information (or save it to a database, etc.)
        String message = "Gender: " + gender + "\n" +
                "Financial Capacity: " + financialCapacity + "\n" +
                "Project Description: " + description + "\n" +
                "Project Name: " + projectName + "\n" +
                "Location: " + location;

        // Show the information in an alert dialog
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Information Submitted, Request Sent");
        alert.setHeaderText("Your Details:");
        alert.setContentText(message);
        alert.showAndWait();
        
        
        
        
        
        stage = (Stage) anchorpane.getScene().getWindow();
		FXMLLoader Loader = new FXMLLoader (getClass().getResource("mainscreen.fxml"));
		root= Loader.load();			  	  
		 // stage =(Stage)((Node)e.getSource()).getScene().getWindow();  // e : action event
		scene = new Scene(root); 
		stage.setTitle("Main page");
		
        stage.setScene(scene);
        stage.show();
        
        

        // Clear fields if desired
     //   clearFields();
        
    }

    
    
    
    // Method to clear all input fields after submission
   /* private void clearFields() {
        txtFinancialCapacity.clear();
        txtDescription.clear();
        txtProjectName.clear();
        txtLocation.clear();
        radioMale.setSelected(true); // Reset gender to default
    }*/
    
    
    
}
