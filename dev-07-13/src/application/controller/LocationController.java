package application.controller;

import application.Location;
import data_access_layer.DataAccessLayer;
import application.CommonObjs;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;

public class LocationController {
	
	private CommonObjs commonObjs = CommonObjs.getInstance();
	@FXML private TextField location_name;
	@FXML private TextArea location_description;
	@FXML private Label result_message;
	private DataAccessLayer DAL = new DataAccessLayer();
	
	@FXML public void saveLocationOp() 
	{	
		//Get text
		String location = location_name.getText();
		String description = location_description.getText();
		
		if(location.length() == 0)
		{
			result_message.setText("Location can not be blank!");
		}
		else
		{
			result_message.setText("Location added successfully!");
		}

 		//Create location object and store name here
		Location loc = new Location(location, description);
		boolean result = DAL.addLocation(loc);
		
		if(!result) {
			result_message.setText("Location " + location + " already exists!");
		}
	}

}
