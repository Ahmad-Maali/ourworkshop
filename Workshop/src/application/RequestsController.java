package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class RequestsController {
	
	
    
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
    
    
    
    
