package application.controller;

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
		//get text 
		String category = category_name.getText();
		
		//check if the category field is left blank
		if(category.length() == 0)
		{
			//display error message for blank category name
			result_message.setText("Category can not be blank!");
		}
		else
		{
			//display message for category being added
			result_message.setText("Category added successfully!");
			
			//create category object and store name
			Category cat = new Category(category);
			
			//call DAL class to store Category names to csv files
			boolean result = DAL.addCategory(cat);
			
			//if the addCategory class returns false, Category name already exists
			if(!result)
			{
				//display category already exists message
				result_message.setText("Category " + category + " already exists!");
			}
		}
	}

}
