package application.controller;

import java.io.IOException;
import java.net.URL;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;

public class MainController {

	@FXML HBox mainBox;
	
	@FXML
	public void initialize() {
		showHomeOp();
	}
	
	@FXML public void showCategoryOp() {
		URL url = getClass().getClassLoader().getResource("view/Category.fxml");
		
		try {
			AnchorPane pane1 = (AnchorPane) FXMLLoader.load(url);
			
			if(mainBox.getChildren().size() > 1)
				mainBox.getChildren().remove(1);
			
			mainBox.getChildren().add(pane1);
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	@FXML public void showHomeOp() {
		URL url = getClass().getClassLoader().getResource("view/Home.fxml");
		
		try {
			AnchorPane pane2 = (AnchorPane) FXMLLoader.load(url);
			
			if(mainBox.getChildren().size() > 1)
				mainBox.getChildren().remove(1);
			
			mainBox.getChildren().add(pane2);
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@FXML public void showLocationOp() {
		URL url = getClass().getClassLoader().getResource("view/Location.fxml");
		
		try {
			AnchorPane pane2 = (AnchorPane) FXMLLoader.load(url);
			
			if(mainBox.getChildren().size() > 1)
				mainBox.getChildren().remove(1);
			
			mainBox.getChildren().add(pane2);
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@FXML public void showCreateAssetOp() {
		URL url = getClass().getClassLoader().getResource("view/CreateAsset.fxml");
		
		try {
			AnchorPane pane2 = (AnchorPane) FXMLLoader.load(url);
			
			if(mainBox.getChildren().size() > 1)
				mainBox.getChildren().remove(1);
			
			mainBox.getChildren().add(pane2);
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@FXML public void showManageAssetOp() {
		URL url = getClass().getClassLoader().getResource("view/ManageAsset.fxml");
		
		try {
			AnchorPane pane2 = (AnchorPane) FXMLLoader.load(url);
			
			if(mainBox.getChildren().size() > 1)
				mainBox.getChildren().remove(1);
			
			mainBox.getChildren().add(pane2);
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@FXML public void showReportOp() {
		URL url = getClass().getClassLoader().getResource("view/Report.fxml");
		
		try {
			AnchorPane pane2 = (AnchorPane) FXMLLoader.load(url);
			
			if(mainBox.getChildren().size() > 1)
				mainBox.getChildren().remove(1);
			
			mainBox.getChildren().add(pane2);
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
