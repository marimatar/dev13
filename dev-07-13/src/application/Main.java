package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.transform.Scale;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			HBox mainBox = (HBox)FXMLLoader.load(getClass().getClassLoader().getResource("view/Main.fxml"));
			Scene scene = new Scene(mainBox);
			scene.getStylesheets().add(getClass().getClassLoader().getResource("css/application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			
			//Keep reference of mainBox inside the commonObjs object
			CommonObjs commonObjs = CommonObjs.getInstance();
			commonObjs.setMainBox(mainBox);
			
			//Make window non-resizable
			primaryStage.setResizable(false);
			
			//Increase current window size by double
			double width = primaryStage.getWidth();
			double height = primaryStage.getHeight();
			primaryStage.setHeight(height*2);
			primaryStage.setWidth(width*2);
			
			//Scale objects to fit new size
			Scale scale = new Scale(2, 2, 0, 0);
			mainBox.getTransforms().add(scale);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
