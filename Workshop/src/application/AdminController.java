package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminController {

    @FXML
    private Button myInfoButton;

    @FXML
    private Button engineersManagementButton;

    @FXML
    private Button workersManagementButton;

    @FXML
    private Button customersManagementButton;

    @FXML
    private Button requestsButton;

    @FXML
    private Button addAdminButton;

    @FXML
    private AnchorPane contentArea; // Area to load content based on button clicks
    
    
    
	Parent root;
	Stage stage;
	FXMLLoader Loader;
    
    

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
    }*/

    @FXML
    public void initialize() {
        // Initial setup, load a default page if needed
        System.out.println("MyInformation"); // Load the default page, "My Information" here
    }



    @FXML
    private void handleMyInfoButton(ActionEvent e) throws IOException {
    	System.out.println("MyInformation");
    	
    	
    		  Loader = new FXMLLoader(getClass().getResource("Admin.fxml"));
  	  		  Parent root = Loader.load();
   			  stage = (Stage) ((Node)e.getSource()).getScene().getWindow();
  			  Scene scene = new Scene(root);
  			  stage.setScene(scene); stage.show();
    	
    	
    	
    	
    	
    }
    
    

    @FXML
    private void handleEngineersManagementButton(ActionEvent e) throws IOException {
    	System.out.println("EngineersManagement");
    	
    	
		  Loader = new FXMLLoader (getClass().getResource("ManEng.fxml"));
		  root= Loader.load();
		  stage =(Stage)((Node)e.getSource()).getScene().getWindow();
		  Scene scene = new Scene(root); 
		//  stage.setTitle("Registration");
		  stage.setScene(scene); stage.show();
    	
    	
    }

    @FXML
    private void handleWorkersManagementButton(ActionEvent e) throws IOException {
    	System.out.println("WorkersManagement");
    	
    	
		  Loader = new FXMLLoader (getClass().getResource("ManWor.fxml"));
		  root= Loader.load();
		  stage =(Stage)((Node)e.getSource()).getScene().getWindow();
		  Scene scene = new Scene(root); 
		//  stage.setTitle("Registration");
		  stage.setScene(scene); stage.show();
		  
    	
    }

    @FXML
    private void handleCustomersManagementButton(ActionEvent e) throws IOException {
    	System.out.println("CustomersManagement");
    	
    	
    	
		  Loader = new FXMLLoader (getClass().getResource("ManCus.fxml"));
		  root= Loader.load();
		  stage =(Stage)((Node)e.getSource()).getScene().getWindow();
		  Scene scene = new Scene(root); 
		//  stage.setTitle("Registration");
		  stage.setScene(scene); stage.show();
    	
    	
    	
    }

    @FXML
    private void handleRequestsButton(ActionEvent e) throws IOException {
    	System.out.println("Requests");
    	
    	
		  Loader = new FXMLLoader (getClass().getResource("Requests.fxml"));
		  root= Loader.load();
		  stage =(Stage)((Node)e.getSource()).getScene().getWindow();
		  Scene scene = new Scene(root); 
		//  stage.setTitle("Registration");
		  stage.setScene(scene); stage.show();
    	
    }
    
    

    @FXML
    private void handleAddAdminButton(ActionEvent e) throws IOException {
    	System.out.println("AddAdmin");
    	
		  Loader = new FXMLLoader (getClass().getResource("AdminReg.fxml"));
		  root= Loader.load();
		  stage =(Stage)((Node)e.getSource()).getScene().getWindow();
		  Scene scene = new Scene(root); 
		//  stage.setTitle("Registration");
		  stage.setScene(scene); stage.show();
    	
    	
    	
    }
    
}
