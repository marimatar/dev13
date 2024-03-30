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
		//get text
		String location = location_name.getText();
		String description = location_description.getText();
		
		//check if the location name field is left blank or not
		if(location.length() == 0)
		{
			//if field left blank, display error message
			result_message.setText("Location can not be blank!");
		}
		//if field is filled correctly
		else 
		{
			//display added Location successfully message
			result_message.setText("Location added successfully!");
			
			//create location object and store name
			Location loc = new Location(location, description);
			
			//called addLocation function using location object and DAL object
			boolean result = DAL.addLocation(loc);
			
			//if addLocation returns false, display location exists message
			if(!result) 
			{
				result_message.setText("Location " + location + " already exists!");
			}
		}
	}

}
