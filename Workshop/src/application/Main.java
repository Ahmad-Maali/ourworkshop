package application;
	
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	
	
	
	
	private static String Id, Name, email, age;
	private static String location, phoneNumber;
	private static String password;
	
	public static void setRegistrationData(String Id, String Name, String email, String age, String location, 
			String phoneNumber, String password) {
		Main.Id = Id;
		Main.Name = Name;
		Main.email = email;
		Main.age = age;
		Main.location = location;
		Main.phoneNumber = phoneNumber;
		Main.password = password;
	}
	

	
	public static String getName() {
		return Name;
	}
	public static String getID() {
		return Id;
	}
	public static String getEmail() {
		return email;
	}
	public static String getAge() {
		return age;
	}
	public static String getLocation() {
		return location;
	}
	public static String getPhoneNumber() {
		return phoneNumber;
	}
	public static String getPassword() {
		return password;
	}
	
	
	
	
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
