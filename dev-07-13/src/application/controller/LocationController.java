package application.controller;

import java.io.IOException;
import java.net.URL;

import application.Location;
import application.CommonObjs;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;

public class LocationController {
	
	private CommonObjs commonObjs = CommonObjs.getInstance();
	@FXML private TextField location_name;
	@FXML private Label result_message;
	
	@FXML public void saveLocationOp() 
	{	
		//Get text
		String location = location_name.getText();
		
		if(location.length() == 0)
		{
			result_message.setText("Location can not be blank!");
		}
		else
		{
			result_message.setText("Location added successfully!");
		}
		
		//Create category object and store name here
		Location loc = new Location(location);
		
	}

}
