/**
 * Main class that demonstrates the Smart Home System.
 * It creates and manages various smart devices using Room and SmartApp classes.
 * Also includes exception handling for possible runtime errors.

 * @author: Dapinderdeep Kaur
 * @version 1.0
 */
public class Main
{
        
    /**
     * Creates objects of Light, Thermostat, and SecurityCamera.
     * Demonstrates Inheritance, Aggregation, and Dependency (uses-a) relationships.
     * Includes try-catch blocks for exception handling.
     */
	public static void main(String[] args) {
	    try{
	        // Creating device objects
	        Light light1 = new Light("l1", "Bedroom Light", "On", 40);
		    Light light2 = new Light("l2", "Guest Room Light", "Off", 0);
		    Thermostat thermostat1 = new Thermostat("t1", "Guest Room Thermostat", "On", 0);
	     	SecurityCamera camera1 = new SecurityCamera("c1", "Bedroom Camera", "Off", true);
	    	SecurityCamera camera2 = new SecurityCamera("c2", "Guest Room Camera", "On", false);
	    	
	    	 // Displaying the information for devices
	    	System.out.println("...............Information for light.............");
	    	light1.display();
	    	light2.turnOff();
	    	light2.display();
	    	System.out.println("\n...............Information for Thermostat.............");
	    	thermostat1.turnOn();
	     	thermostat1.display();
	    	System.out.println("\n...............Information for Camera.............");
	    	camera1.turnOn();
	    	camera1.setRecording(false);
	    	camera1.display();
	     	camera2.setRecording(true);
	    	camera2.display();
	    	
		     // Creating the rooms and adding devices (Aggregation relationship)
	    	Room bedRoom = new Room("Bedroom", 1);
	    	Room guestRoom = new Room("Guest Room", 3);
	    	System.out.println("\n................Information of rooms with devices.............");
	    	bedRoom.addDevice(light1);
	    	bedRoom.addDevice(camera1);

	    	guestRoom.addDevice(light2);
	    	guestRoom.addDevice(camera2);
	    	guestRoom.addDevice(thermostat1);
	    	guestRoom.removeDevice(camera2);
		
		    bedRoom.displayDevices();
	    	guestRoom.displayDevices();
		
		     // Using SmartApp to control devices (Dependency relationship)
	    	System.out.println("\n.....The following changes has been made using the Smart App......");
	    	SmartApp smApp1 = new SmartApp();
	    	SmartApp smApp2 = new SmartApp();
	    	SmartApp seeCam = new SmartApp();
	    	smApp1.turnOffDevice(thermostat1);
	     	smApp2.turnOnDevice(light2);
	    	smApp1.setTemperature(thermostat1, 70);
	    	smApp2.setBrightness(light2, 50);
	    	seeCam.checkStatus(camera1);
	    }
		
		// Handling the exceptions
		catch (NullPointerException e) {
            System.out.println("Error: One of the devices was not initialized properly.");
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Too many devices were added to the room.");
        } 
        catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }
	}
	
}
