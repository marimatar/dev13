package application;

public class Location
{
private String locationName;
	
	//constructor 
	public Location(String name)
	{
		this.locationName = name;
	}
	
	//set function for location name
	public void setLocationName(String name)
	{
		this.locationName = name;
	}
	
	//get function for location name
	public String getLocationName()
	{
		return this.locationName;
	}
}
