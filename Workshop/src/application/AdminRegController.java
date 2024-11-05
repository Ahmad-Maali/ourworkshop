package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;

public class AdminRegController {

    // FXML fields from AdminReg.fxml
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
    private TextField educationalStatusField;

    @FXML
    private TextField workinghoursField;
    
    @FXML
    private TextField ownershipField; 
    

    @FXML
    private PasswordField passwordField;

    @FXML
    private PasswordField confirmPasswordField;

    @FXML
    private Button registerButton;

    // Radio buttons for gender
    @FXML
    private RadioButton maleRadioButton;

    @FXML
    private RadioButton femaleRadioButton;


    // Method to initialize ToggleGroup for gender selection


    // Method to handle the registration process
    @FXML
    private void handleRegisterButton(ActionEvent event) {
        // Validate inputs
        if (validateInputs()) {
            // Process registration (e.g., save data to database or file)
            saveAdminData();

            // Optionally, clear the fields after saving
            clearFields();

            System.out.println("Admin registered successfully!");
        } else {
            System.out.println("Please fill out all required fields correctly.");
        }
    }

    // Helper method to validate inputs
    private boolean validateInputs() {
        if (nameField.getText().isEmpty() || idField.getText().isEmpty() || emailField.getText().isEmpty()
                || ageField.getText().isEmpty() || locationField.getText().isEmpty() || phoneField.getText().isEmpty()
                || educationalStatusField.getText().isEmpty() ||  ownershipField.getText().isEmpty() || workinghoursField.getText().isEmpty()
                || passwordField.getText().isEmpty() || confirmPasswordField.getText().isEmpty()) {
            return false;
        }

        // Check if password and confirm password match
        if (!passwordField.getText().equals(confirmPasswordField.getText())) {
            System.out.println("Passwords do not match!");
            return false;
        }

        // Additional validation (e.g., email format, phone number format, etc.) can go here

        return true;
    }

    // Method to save admin data (implementation can vary)
        
    	private void saveAdminData() {
    		System.out.println("saving data....");
     //   String gender = ((RadioButton) genderToggleGroup.getSelectedToggle()).getText();
        // Logic to save data goes here
        // For example, write to a database, file, or another data structure
    }
    

    // Helper method to clear all fields after registration
    private void clearFields() {
        nameField.clear();
        idField.clear();
        emailField.clear();
        ageField.clear();
        locationField.clear();
        phoneField.clear();
        educationalStatusField.clear();
        workinghoursField.clear();
        ownershipField.clear();
        passwordField.clear();
        confirmPasswordField.clear();
      // Clear gender selection
    }

    // Navigation methods (same as your original code)
    Parent root;
    Stage stage;
    FXMLLoader loader;

    // Method to load different views
    @FXML
    private void handleMyInfoButton(ActionEvent e) throws IOException {
        loadScene(e, "Admin.fxml");
    }

    @FXML
    private void handleEngineersManagementButton(ActionEvent e) throws IOException {
        loadScene(e, "ManEng.fxml");
    }

    @FXML
    private void handleWorkersManagementButton(ActionEvent e) throws IOException {
        loadScene(e, "ManWor.fxml");
    }

    @FXML
    private void handleCustomersManagementButton(ActionEvent e) throws IOException {
        loadScene(e, "ManCus.fxml");
    }

    @FXML
    private void handleRequestsButton(ActionEvent e) throws IOException {
        loadScene(e, "Requests.fxml");
    }

    @FXML
    private void handleAddAdminButton(ActionEvent e) throws IOException {
        loadScene(e, "AdminReg.fxml");
    }

    private void loadScene(ActionEvent event, String fxmlFile) throws IOException {
        loader = new FXMLLoader(getClass().getResource(fxmlFile));
        root = loader.load();
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
