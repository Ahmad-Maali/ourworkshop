package application;

	import javafx.fxml.FXML;
	import javafx.scene.control.Button;
	import javafx.scene.control.RadioButton;
	import javafx.scene.control.TextArea;
//	import javafx.scene.control.ToggleGroup;
	import javafx.event.ActionEvent;
	import javafx.scene.control.Alert;
	import javafx.scene.control.Alert.AlertType;

	public class EngController {

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
	    
	    // Method to handle finish button click
	    @FXML
	    private void handleFinishButton(ActionEvent event) {
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
	        alert.setTitle("Information Submitted");
	        alert.setHeaderText("Your Details:");
	        alert.setContentText(message);
	        alert.showAndWait();
	    }
	}



