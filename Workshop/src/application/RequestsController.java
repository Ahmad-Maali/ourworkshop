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
	FXMLLoader Loader;
    
    
        
        
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
    		  stage.setTitle("hi");
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
    
    
    
    
