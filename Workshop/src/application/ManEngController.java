package application;

import java.io.IOException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.Alert.AlertType;




import javafx.event.ActionEvent;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;





public class ManEngController {

    @FXML
    private ListView<String> engineerListView;

    @FXML
    private Button editButton;

    @FXML
    private Button deleteButton;

    // List to hold engineer names
    private final ObservableList<String> engineerList = FXCollections.observableArrayList(
        "Engineer 1", "Engineer 2", "Engineer 3", "Engineer 4"
    );

    @FXML
    public void initialize() {
        // Set items in the ListView and enable selection mode
        engineerListView.setItems(engineerList);
        engineerListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);

        // Disable edit and delete buttons initially until an item is selected
        editButton.setDisable(true);
        deleteButton.setDisable(true);

        // Add a listener to enable buttons when an engineer is selected
        engineerListView.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            boolean selectionExists = newSelection != null;
            editButton.setDisable(!selectionExists);
            deleteButton.setDisable(!selectionExists);
        });
    }

    @FXML
    private void handleEditButton() {
        String selectedEngineer = engineerListView.getSelectionModel().getSelectedItem();
        if (selectedEngineer != null) {
            // Display an alert as a placeholder for edit functionality
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Edit Engineer");
            alert.setHeaderText(null);
            alert.setContentText("Editing: " + selectedEngineer);
            alert.showAndWait();

            // TODO: Implement the actual edit functionality here (e.g., open a new form)
        }
    }
    
    @FXML
    private void handleDeleteButton() {
        String selectedEngineer = engineerListView.getSelectionModel().getSelectedItem();
        if (selectedEngineer != null) {
            // Confirm deletion
            Alert confirmDelete = new Alert(Alert.AlertType.CONFIRMATION);
            confirmDelete.setTitle("Delete Engineer");
            confirmDelete.setHeaderText("Are you sure you want to delete this engineer?");
            confirmDelete.setContentText(selectedEngineer);

            confirmDelete.showAndWait().ifPresent(response -> {
                if (response == ButtonType.OK) {
                    // Remove the selected engineer from the list
                    engineerList.remove(selectedEngineer);
                }
            });
        }
    }
        
        
    
	Parent root;
	Stage stage;
	FXMLLoader loader;
    
    
        
        
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

        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   
