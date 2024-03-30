package application.controller;

import java.util.HashMap;
import java.util.Map;

import application.Category;
import application.CommonObjs;
import data_access_layer.DataAccessLayer;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CategoryController 
{
	private CommonObjs commonObjs = CommonObjs.getInstance();
	@FXML private TextField category_name;
	@FXML private Label result_message;
	private DataAccessLayer DAL = new DataAccessLayer();
	
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
			
			//Create category object and store name here
			Category cat = new Category(category);
			boolean result = DAL.addCategory(cat);
			
			if(!result)
			{
				result_message.setText("Category " + category + " already exists!");
			}
		}
	}

}
