package data_access_layer;

import java.io.*;
import java.util.HashMap;

import application.Category;
import application.Location;

public class DataAccessLayer {
	
    private String locationFilePath;
    private String categoryFilePath;
    private HashMap<String, Location> locationsMap;
    private HashMap<String, Category> categoriesMap;
    
    public DataAccessLayer()
    {
    	locationFilePath = "resources/csv/locations.csv";
    	categoryFilePath = "resources/csv/categories.csv";
    	locationsMap = new HashMap<>();
    	categoriesMap = new HashMap<>();
    }
    
    public boolean addLocation(Location location){
    	
        if(locationsMap.containsKey(location.getLocationName())) {
            return false;
        }
        
        locationsMap.put(location.getLocationName(), location);
        
        appendToFile(locationFilePath, location.getLocationName()
        		+ "," + location.getLocationDescr());

        return true;
    }
    
    public boolean addCategory(Category category) {
    	
        if(categoriesMap.containsKey(category.getCategoryName())) {
            return false;
        }
        
        categoriesMap.put(category.getCategoryName(), category);
        appendToFile(categoryFilePath, category.getCategoryName());
        
        return true;
        
    }
    
    private void appendToFile(String filePath, String content) {
    	
    	try {
        	FileWriter fw = new FileWriter(filePath, true);
        	BufferedWriter bw = new BufferedWriter(fw);
        	PrintWriter out = new PrintWriter(bw);
            out.println(content);
            out.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public HashMap<String, Location> getLocationsMap() {
        return locationsMap;
    }

    public HashMap<String, Category> getCategoriesMap() {
        return categoriesMap;
    }
   
}