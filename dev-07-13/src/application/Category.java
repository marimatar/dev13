package application;

public class Category {
	private String categoryName;
	
	//constructor 
	public Category(String name)
	{
		this.categoryName = name;
	}
	
	//set function for category name
	public void setCategoryName(String name)
	{
		this.categoryName = name;
	}
	//get function for category name
	public String getCategoryName()
	{
		return this.categoryName;
	}
}
