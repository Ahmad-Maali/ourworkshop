package application;

	import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
	import javafx.scene.control.RadioButton;
	import javafx.scene.control.TextArea;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

//	import javafx.scene.control.ToggleGroup;
	import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
	import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

	public class EngController {

		
		
	//    @FXML
	//    private AnchorPane anchorpane;
		
		
	    @FXML
	    private RadioButton maleRadioButton;

	    @FXML
	    private RadioButton femaleRadioButton;

	    @FXML
	    private TextArea certificates;

	    @FXML
	    private TextArea experience;

	    @FXML
	    private TextArea skills;

	    @FXML
	    private Button finishButton;

	    // Initialize method to group radio buttons
/*	    @FXML
	    public void initialize() {
	        ToggleGroup genderGroup = new ToggleGroup();
	        maleRadioButton.setToggleGroup(genderGroup);
	        femaleRadioButton.setToggleGroup(genderGroup);
	    }
*/
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    @FXML
	    private AnchorPane anchorpane;
	    private Parent root;
	    private Stage stage;
	    private Scene scene;
	    
	    
	    // Method to handle finish button click
	    @FXML
	    private void handleFinishButton(ActionEvent event) throws IOException {
	        // Get the input values
	        String selectedGender = maleRadioButton.isSelected() ? "Male" : femaleRadioButton.isSelected() ? "Female" : "Not specified";
	        String certificatesText = certificates.getText();
	        String experienceText = experience.getText();
	        String skillsText = skills.getText();

	        // Display the collected information (or save it to a database, etc.)
	        String message = "Gender: " + selectedGender +
	                         "\nCertificates: " + certificatesText +
	                         "\nExperience: " + experienceText +
	                         "\nSkills: " + skillsText;

	        // Show the information in an alert dialog
	        Alert alert = new Alert(AlertType.INFORMATION);
	        alert.setTitle("Information Submitted, Request Sent");
	        alert.setHeaderText("Your Details:");
	        alert.setContentText(message);
	        alert.showAndWait();
	        
	        
	        
	        try {
	    			DriverManager.deregisterDriver(new org.postgresql.Driver());
	    			  String url = "jdbc:postgresql://localhost:5432/postgres";
	    			  
	    			 String user= "postgres";
	    			 String password2 = "123456";
	    			  
	    			Connection con =DriverManager.getConnection(url,user,password2);
	    			
	    			con.setAutoCommit(false);
	 
	    			
	    			String qry1 = "INSERT INTO engineer VALUES ('" + Main.getName() + "', '" + Main.getID() + "', '" + Main.getEmail() + "', '" +
	    		              Main.getAge() + "', '" + Main.getLocation() + "', '" + Main.getPhoneNumber() + "', '" + 
	    		              Main.getPassword() + "', '" +selectedGender+ "', '" +certificatesText+ "', '" +experienceText+ "', '" +skillsText+ "')";

	    		     
	    			Statement stm = con.createStatement();
	    			  stm.executeUpdate(qry1);
	    			  con.commit();
	    			  con.close();
	    			  
	    			} catch (Exception e) {
	    				// TODO Auto-generated catch block
	    				e.printStackTrace();
	    			}
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        stage = (Stage) anchorpane.getScene().getWindow();
			FXMLLoader Loader = new FXMLLoader (getClass().getResource("mainscreen.fxml"));
			root= Loader.load();			  	  
			 // stage =(Stage)((Node)e.getSource()).getScene().getWindow();  // e : action event
			scene = new Scene(root); 
			stage.setTitle("Main page");
			
	        stage.setScene(scene);
	        stage.show();
	    }
	}



