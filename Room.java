/**
 * Represents a room that has smart devices.
 * Shows a has-a (aggregation) relationship with the Device class.
 * @param roomName: Name of the room looking at
 * @param devices: Array of device objects belonging to the room
 * @param deviceCount: To keep track of count of devices the room has
 */
public class Room{
    private String roomName;
    private Device[] devices;
    private int deviceCount = 0;
    
    //Constructor to iniliaze variables
    public Room(String givenRoomName, int givenCount){
        devices = new Device[givenCount];
        roomName = givenRoomName;
    }
    
    /**
     * Adds a new device to the room.
     * @param newDevice: the device to be added
     */
    public void addDevice(Device newDevice){
        //try-catch block for any exception while adding the device
        try {
            if (newDevice == null) {
               throw new IllegalArgumentException("Device cannot be null");
            }
             
            //if statement to stay within length of array 
            if(deviceCount < devices.length){
                //adds the device
                devices[deviceCount] = newDevice;
                deviceCount++;
            }
            else {
            throw new ArrayIndexOutOfBoundsException("Room is full, cannot add more devices");
            }
        }
        catch (Exception e) {
            System.out.println("Error adding device: " + e.getMessage());
        }
    }
    
    /**
     * Removes a specific device from the room.
     * @param remOldDevice: the device to be removed
     */
    public void removeDevice(Device remOldDevice){
        //try-catch block for any exception while trying to remove the device
        try {
            if (remOldDevice == null) {
                throw new IllegalArgumentException("Device to remove cannot be null");
            }
        
            for (int i = 0; i < devices.length; i++) {
                //checks if the index is not empty and if the name of device to be removed is same deviceName at that index
                if (devices[i] != null && devices[i].deviceName.equals(remOldDevice.deviceName)) {
                    //removes the device
                    devices[i] = null;
                    deviceCount--;
                    System.out.println(remOldDevice.deviceName + " removed successfully.");
                    return;
                }
            }
            System.out.println("Device not found in room: " + remOldDevice.deviceName);
        } 
        catch (Exception e) {
            System.out.println("Error removing device: " + e.getMessage());
        }
    }
    
    //display the information of room
    public void displayDevices(){
        System.out.printf("%s has %d devices named as: ", roomName, deviceCount);
        for(int i = 0; i < devices.length; i++){
            if(devices[i] != null){
            System.out.print(devices[i].deviceName + " ");
            } 
        }
        System.out.println();
    }
    
}