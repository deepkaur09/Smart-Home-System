/**
 * Represents a SmartApp that controls smart devices.
 * Shows a use-a (dependency) relationship with the Device class and its subclasses.
*/
public class SmartApp {
    /**
     * Turns on a given smart device.
     * @param smartDevice: the device to be turned on
    */
    public void turnOnDevice(Device smartDevice) {
        try {
            //exception handling if the given input is null
            if(smartDevice == null) throw new NullPointerException("Device not found");
        
            smartDevice.turnOn();
            System.out.printf("The device %s has been turned On\n", smartDevice.deviceName);
        }
        catch (Exception e){
            System.out.println("Error turning on device: " + e.getMessage());
        }
    }
    
    /**
     * Turns off a given smart device.
     * @param smartDevice: the device to be turned off
    */
    public void turnOffDevice(Device smartDevice) {
        smartDevice.turnOff();
        System.out.printf("The device %s has been turned Off\n", smartDevice.deviceName);
    }
    
    // @param smartCamera: the SecurityCamera object whose status is to be checked
    public void checkStatus(SecurityCamera smartCamera){
        System.out.printf("The status of %s is %s\n", smartCamera.deviceName, smartCamera.getStatus());
    }
    
    /**
     * Sets the temperature for a thermostat.
     * @param newThermo the Thermostat object
     * @param temp the temperature to set
     */
    public void setTemperature(Thermostat newThermo, double temp) {
        // turning device on
        if(newThermo.status.equals("Off")){
            newThermo.turnOn();
        }
        newThermo.setTemp(temp);
        System.out.printf("The temp of device %s has been set to %.2f\n", newThermo.deviceName, temp);
    }
    
     /**
     * Sets the brightness level for a light.
     * @param newLight: the Light object
     * @param brightness: the brightness value to be set
     */
    public void setBrightness(Light newLight, int brightness){
         if(newLight.status.equals("Off")){
            newLight.turnOn();
        }
        newLight.setBrightness(brightness);
        System.out.printf("The temp of device %s has been set to %d\n", newLight.deviceName, brightness);
    }
    
    
}