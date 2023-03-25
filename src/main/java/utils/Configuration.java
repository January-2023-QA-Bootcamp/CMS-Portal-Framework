package utils;

import java.io.IOException;
import java.util.Properties;
import  static utils.IConstant.*;

public class Configuration {
	// The Properties class represents a persistent set of properties.
	private Properties properties;

	// Constructor
	// Why I am putting loadProperty () method inside constructor
	public Configuration() {
		loadProperty();
	}
	
	public void loadProperty() {
		properties = new Properties();
		try {
			properties.load(getClass().getClassLoader().getResourceAsStream("config.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// Individual method created
	public String getProperties(String key) {
		return properties.getProperty(key);
	}
	
	/*
	// Unit test just to see loadProperty() is working and then the getProperty is giving us expected value
	public static void main(String[] args) {
		Configuration configuration = new Configuration(); // default constructor initialized
		// configuration.loadProperty(); // we don't need, above line doing the action
		System.err.println(configuration.getProperties(URL));
		System.err.println(configuration.getProperties(BROWSER));
	}
	*/
	
}
