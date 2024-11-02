package application;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
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
    private void handleFinishRequest(ActionEvent event) {
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
