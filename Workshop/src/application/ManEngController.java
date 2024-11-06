package application;

import java.io.IOException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ManEngController {

    // FXML elements
    @FXML
    private Button editCustomerButton;

    @FXML
    private Button editWorkshopButton;

    @FXML
    private Button deleteEngineerButton;

    @FXML
    private ListView<String> engineerListView;

    // List of engineers
    private final ObservableList<String> engineerList = FXCollections.observableArrayList(
        "Engineer 1", "Engineer 2", "Engineer 3", "Engineer 4"
    );

    @FXML
    public void initialize() {
        // Set items in the ListView and enable selection mode if ListView is present in FXML
        if (engineerListView != null) {
            engineerListView.setItems(engineerList);
            engineerListView.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
                boolean selectionExists = newSelection != null;
                deleteEngineerButton.setDisable(!selectionExists);
                editCustomerButton.setDisable(!selectionExists);
                editWorkshopButton.setDisable(!selectionExists);
            });
        }

        // Initially disable edit and delete buttons until an engineer is selected
        deleteEngineerButton.setDisable(true);
        editCustomerButton.setDisable(true);
        editWorkshopButton.setDisable(true);
    }

    @FXML
    private void handleEditCustomerButton() {
        String selectedEngineer = engineerListView.getSelectionModel().getSelectedItem();
        
        if (selectedEngineer != null) {
            // Display an alert to confirm editing (this can be replaced with actual edit logic)
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Edit Engineer (Customer Button)");
            alert.setHeaderText(null);
            alert.setContentText("Editing (via Customer button): " + selectedEngineer);
            alert.showAndWait();

            // TODO: Implement actual edit functionality here, e.g., prompt for a new name and update the list
        }
    }

    @FXML
    private void handleEditWorkshopButton() {
        String selectedEngineer = engineerListView.getSelectionModel().getSelectedItem();
        
        if (selectedEngineer != null) {
            // Display an alert to confirm editing (this can be replaced with actual edit logic)
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Edit Engineer (Workshop Button)");
            alert.setHeaderText(null);
            alert.setContentText("Editing (via Workshop button): " + selectedEngineer);
            alert.showAndWait();

            // TODO: Implement actual edit functionality here, e.g., prompt for a new name and update the list
        }
    }

    @FXML
    private void handleDeleteButton() {
        String selectedEngineer = engineerListView.getSelectionModel().getSelectedItem();
        if (selectedEngineer != null) {
            Alert confirmDelete = new Alert(Alert.AlertType.CONFIRMATION);
            confirmDelete.setTitle("Delete Engineer");
            confirmDelete.setHeaderText("Are you sure you want to delete this engineer?");
            confirmDelete.setContentText(selectedEngineer);

            confirmDelete.showAndWait().ifPresent(response -> {
                if (response == ButtonType.OK) {
                    engineerList.remove(selectedEngineer);
                    showAlert(AlertType.INFORMATION, "Delete Engineer", null, "Engineer deleted successfully.");
                }
            });
        }
    }

    // Utility method to show alerts
    private void showAlert(AlertType type, String title, String header, String content) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(header);
        alert.setContentText(content);
        alert.showAndWait();
    }

    // Scene-switching methods for sidebar menu
    private Parent root;
    private Stage stage;
    private FXMLLoader loader;

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
