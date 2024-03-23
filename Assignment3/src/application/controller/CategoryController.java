package application.controller;

import java.io.IOException;
import java.net.URL;
import application.CommonObjs;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;

public class CategoryController 
{
	private CommonObjs commonObjs = CommonObjs.getInstance();
	@FXML private TextField category_name;
	@FXML private Label result_message;
	
	@FXML public void saveCategoryOp() 
	{	
		//Get text
		String category = category_name.getText();
		
		if(category.length() == 0)
		{
			result_message.setText("Category can not be blank!");
		}
		else
		{
			result_message.setText("Category added successfully!");
			
			//result_message.set
			System.out.println(result_message.getText());
		}
		
		//Create category object and store name here
		
		
		
	}

}
