package application.controller;

import java.io.IOException;
import java.net.URL;

import application.Category;
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
		}
		
		//Create category object and store name here
		Category cat = new Category(category);
		
	}

}