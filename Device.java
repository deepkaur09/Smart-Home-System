//base class
public class Device{
    public String deviceId;
    public String deviceName;
    public String status;
    
    Device(String deviceId, String deviceName, String status){
        this.deviceId = deviceId;
        this.deviceName = deviceName;
        this.status = status;
    }

    public void turnOn(){ }

    public void turnOff(){ }
    
    public void display(){ }
    
}
 
//is-a relationship with class Device (Inheritance)
class Light extends Device{
    int brightness;
    
    //constructor to set values for variables
    Light(String deviceId, String deviceName, String status, int brightness){
        //initializing variables using base-class
        super(deviceId, deviceName, status);
        this.brightness = brightness;
    }
    
    @Override
    public void turnOn(){
        status = "On";
    }
    
    @Override
    public void turnOff(){
        status = "Off";
    }
    
    //@param brightness: To set the brightness for light
    public void setBrightness(int brightness){
        this.brightness = brightness;
    }
    
    //@return status: the status of the device(On/Off)
    public String getStatus(){
        return status;
    }
    
    @Override
    public void display(){
        System.out.printf("The ID of the device is %s\n", deviceId);
        System.out.printf("The name of the device is %s\n", deviceName);
        System.out.printf("The status of light is %s\n", status);
        System.out.printf("The brightness set is %d\n", brightness);
    }
}

//is-a relationship with class Device (Inheritance)
class Thermostat extends Device{
    double temp;
     
    //constructor to set values for variables
    Thermostat(String deviceId, String deviceName, String status, double temp){
        //initializing variables using base-class
        super(deviceId, deviceName, status);
        this.temp = temp;
    }
    
    @Override
    public void turnOn(){
        status = "On";
    }
    
    @Override
    public void turnOff(){
        status = "Off";
    }
    
    //@param temp: To set the temperature of the thermostat
    public void setTemp(double temp){
        this.temp = temp;
    }
    
    //@return status: To check status of the device(On/Off)
    public String getStatus(){
        return status;
    }
    
    @Override
    public void display(){
        System.out.printf("The ID of the device is %s\n", deviceId);
        System.out.printf("The name of the device is %s\n", deviceName);
        System.out.printf("The status of light is %s\n", status);
        System.out.printf("The temp set by thermostat is %.2f degree C\n", temp);
    }
}

//is-a relationship with class Device (Inheritance)
class SecurityCamera extends Device{
    boolean recording;
    //constructor to set values for variables
    SecurityCamera(String deviceId, String deviceName, String status, boolean recording){
        //initializing variables using Device(Base) class
        super(deviceId, deviceName, status);
        this.recording = recording;
    }
    
    @Override
    public void turnOn(){
        status = "On";
    }
    
    @Override
    public void turnOff(){
        status = "Off";
    }
    
    //@param recording: To set the recording to true or false
    public void setRecording(boolean recording){
        this.recording = recording;
    }
 
    //@return status: To check status of the device(On/Off)
    public String getStatus(){
        return status;
    }
    
    @Override
    public void display(){
        System.out.printf("The ID of the device is %s\n", deviceId);
        System.out.printf("The name of the device is %s\n", deviceName);
        System.out.printf("The status of camera is %s\n", status);
        if(recording){
            System.out.println("The camera is recording the data");
        }
        else{
            System.out.println("The camera is not recording the data");
        }
    }
    
}
