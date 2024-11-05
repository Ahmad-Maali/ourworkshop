package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import java.io.IOException;


    // Method to handle loading different FXML files based on the selected button
  /*  private void loadPage(String page) {
        try {
            // Load the selected page
            Parent fxml = FXMLLoader.load(getClass().getResource(page + ".fxml"));
            // Clear the existing content and add the new page to content area
            contentArea.getChildren().clear();
            contentArea.getChildren().add(fxml);
            // Set the page to fill the content area
            AnchorPane.setTopAnchor(fxml, 0.0);
            AnchorPane.setBottomAnchor(fxml, 0.0);
            AnchorPane.setLeftAnchor(fxml, 0.0);
            AnchorPane.setRightAnchor(fxml, 0.0);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
*/




public class AdminController {

    private Stage stage;
    private Parent root;
    private FXMLLoader loader;

    // Admin form fields
    @FXML
    private TextField nameField;
    @FXML
    private TextField idField;
    @FXML
    private TextField emailField;
    @FXML
    private TextField ageField;
    @FXML
    private TextField ownershipField;
    @FXML
    private TextField educationalStatusField;
    @FXML
    private TextField locationField;
    @FXML
    private TextField phoneField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private TextField workingHoursField;

    @FXML
    private TextField genderField;
    

    @FXML
    private Button editButton;
    
    
    
    private boolean isEditable = false; 


    
    @FXML
    public void initialize() {
        // Initial setup, load a default page if needed
        System.out.println("MyInformation"); // Load the default page, "My Information" here


        genderField.setEditable(false);
        
        lockFields();
    }
    
    
    
 // Method to handle Edit button action
    @FXML
    private void handleEditButton(ActionEvent e) {
        isEditable = !isEditable;  // Toggle the edit state

        // Update the fields' editable state based on the current toggle
        nameField.setEditable(true);
        idField.setEditable(true);
        emailField.setEditable(true);
        ageField.setEditable(true);
        ownershipField.setEditable(true);
        educationalStatusField.setEditable(true);
        locationField.setEditable(true);
        phoneField.setEditable(true);
        passwordField.setEditable(true);
        workingHoursField.setEditable(true);

        // Update the button text to indicate the current state
        editButton.setText(isEditable ? "Save" : "Edit");

        // Additional logic to save changes if switching back to non-editable state
        if (!isEditable) {
            saveChanges();  // Call a method to save changes (implement this if needed)
        }
    }

    // Optional method to save changes
    private void saveChanges() {
        // Logic to save data goes here
        System.out.println("Saving changes...");
        lockFields();
        
        
        // For example, validate inputs and save to a database or file if necessary
    }
    
    
    
    
    
    
    
    // Method to load "My Information" view
    @FXML
    private void handleMyInfoButton(ActionEvent e) throws IOException {
        loadScene(e, "Admin.fxml");
    }

    // Method to load "Engineers Management" view
    @FXML
    private void handleEngineersManagementButton(ActionEvent e) throws IOException {
        loadScene(e, "ManEng.fxml");
    }

    // Method to load "Workers Management" view
    @FXML
    private void handleWorkersManagementButton(ActionEvent e) throws IOException {
        loadScene(e, "ManWor.fxml");
    }

    // Method to load "Customers Management" view
    @FXML
    private void handleCustomersManagementButton(ActionEvent e) throws IOException {
        loadScene(e, "ManCus.fxml");
    }

    // Method to load "Requests" view
    @FXML
    private void handleRequestsButton(ActionEvent e) throws IOException {
        loadScene(e, "Requests.fxml");
    }

    // Method to load "Add Admin" view
    @FXML
    private void handleAddAdminButton(ActionEvent e) throws IOException {
        loadScene(e, "AdminReg.fxml");
    }

    // Utility method for loading a new scene
    private void loadScene(ActionEvent event, String fxmlFile) throws IOException {
        loader = new FXMLLoader(getClass().getResource(fxmlFile));
        root = loader.load();
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    // Optional: Add more methods for form handling and data processing as needed
    // For example, you could add a method to lock fields if they’re meant to be read-only

   
    
    public void lockFields() {
        nameField.setEditable(false);
        idField.setEditable(false);
        emailField.setEditable(false);
        ageField.setEditable(false);
        ownershipField.setEditable(false);
        educationalStatusField.setEditable(false);
        locationField.setEditable(false);
        phoneField.setEditable(false);
        passwordField.setEditable(false);
        workingHoursField.setEditable(false);
    }
    
   

    // Additional methods for other functionalities can be added here
}























