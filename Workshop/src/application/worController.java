package application;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ChoiceBox;

import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

// import javafx.scene.control.ToggleGroup;
import javafx.event.ActionEvent;

public class worController {

    @FXML
    private TextField txtHoursPerWeek;

    @FXML
    private TextField txtJobRole;

    @FXML
    private TextField txtYearsExperience;

    @FXML
    private TextField txtTransport;

    @FXML
    private ChoiceBox<String> comboPreferredShift;

    @FXML
    private ChoiceBox<String> comboEmploymentStatus;

    @FXML
    private RadioButton radioPhysicalYes;

    @FXML
    private RadioButton radioPhysicalNo;

    @FXML
    private RadioButton radioEmergencyYes;

    @FXML
    private RadioButton radioEmergencyNo;

    @FXML
    private Button btnSubmit;
    
    
    
    @FXML
    private AnchorPane anchorpane;
    private Parent root;
    private Stage stage;
    private Scene scene;
    

   // private ToggleGroup physicalCapabilityGroup;
 //   private ToggleGroup emergencyAvailabilityGroup;

    @FXML
    public void initialize() {
        // Set up ToggleGroups for the RadioButtons
     //   physicalCapabilityGroup = new ToggleGroup();
    //    radioPhysicalYes.setToggleGroup(physicalCapabilityGroup);
    //    radioPhysicalNo.setToggleGroup(physicalCapabilityGroup);

   //     emergencyAvailabilityGroup = new ToggleGroup();
  //      radioEmergencyYes.setToggleGroup(emergencyAvailabilityGroup);
  //      radioEmergencyNo.setToggleGroup(emergencyAvailabilityGroup);

        // Set ComboBox options (Example options, update with actual options as needed)
    	
    	
        comboPreferredShift.getItems().addAll("Morning(start from 7AM)", "Afternoon(start from 2PM)", "Night(start from 8PM)");
        comboEmploymentStatus.getItems().addAll("Full-time", "Part-time", "Freelance");

        // Attach event handler to the submit button
      //**  btnSubmit.setOnAction(this::handleSubmit);
    }
    
    
    
@FXML
    private void handleSubmit(ActionEvent event) throws IOException {
    	
    	
    	
        // Set ComboBox options (Example options, update with actual options as needed)
     //   comboPreferredShift.getItems().addAll("Morning", "Afternoon", "Night");
    //    comboEmploymentStatus.getItems().addAll("Full-time", "Part-time", "Freelance");
    	
    	
        // Retrieve input data
        String hoursPerWeek = txtHoursPerWeek.getText().trim();
        String jobRole = txtJobRole.getText().trim();
        String yearsExperience = txtYearsExperience.getText().trim();
        String transportAvailability = txtTransport.getText().trim();
        String preferredShift = comboPreferredShift.getValue();
        String employmentStatus = comboEmploymentStatus.getValue();

        String physicalCapability = radioPhysicalYes.isSelected() ? "Yes" : "No";
        String emergencyAvailability = radioEmergencyYes.isSelected() ? "Yes" : "No";

        // Simple validation to check if required fields are filled
        if (hoursPerWeek.isEmpty() || jobRole.isEmpty() || yearsExperience.isEmpty() || transportAvailability.isEmpty() || preferredShift == null || employmentStatus == null) {
            System.out.println("Please fill out all required fields.");
            return;
        }

        // Print or save the information (for debugging, you might save this to a database or send it to a server)
        System.out.println("Hours Available per Week: " + hoursPerWeek);
        System.out.println("Job Role: " + jobRole);
        System.out.println("Years of Experience: " + yearsExperience);
        System.out.println("Preferred Shift: " + preferredShift);
        System.out.println("Current Employment Status: " + employmentStatus);
        System.out.println("Transportation Availability: " + transportAvailability);
        System.out.println("Physical Capability: " + physicalCapability);
        System.out.println("Emergency Availability: " + emergencyAvailability);

        // Optionally clear fields after submission
      //  clearFields();
        
        
        String message = "Hours Available per Week: " + hoursPerWeek + "\n" +
                "Job Role: " + jobRole + "\n" +
                "Years of Experience: " + yearsExperience + "\n" +
                "Preferred Shift: " + preferredShift + "\n" +
                "Employment Status: " + employmentStatus + "\n" +
                "Transportation Availability: " + transportAvailability + "\n" +
                "Physical Capability: " + physicalCapability + "\n" +
                "Emergency Availability: " + emergencyAvailability;
        
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Request Sent, Information Submitted");
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
        
        
    }

    private void clearFields() {
        txtHoursPerWeek.clear();
        txtJobRole.clear();
        txtYearsExperience.clear();
        txtTransport.clear();
        comboPreferredShift.setValue(null);
        comboEmploymentStatus.setValue(null);
        radioPhysicalYes.setSelected(true);  // Set default option if needed
        radioEmergencyYes.setSelected(true); // Set default option if needed
    }
}
