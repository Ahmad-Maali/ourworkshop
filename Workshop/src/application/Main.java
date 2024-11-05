package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		
		
		try {
			
			
			
			
			Parent root = FXMLLoader.load(getClass().getResource("mainscreen.fxml"));
			
			Scene scene = new Scene(root);
	         // Set the window icon
            primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("AandZ.jpg")));

            primaryStage.setScene(scene);
            primaryStage.setTitle("Main page");
            primaryStage.show();
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		launch(args);
	}
}
