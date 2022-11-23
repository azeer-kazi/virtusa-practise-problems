interface WiFi
{
    void wifiRange();
    void wifiName();
}

interface camera
{
    void openCamera();
    void takePic();
}

class SmartPhone2 implements WiFi,camera
{
    
    public void wifiName()
    {
        System.out.println("name-->azeer kazi");
    }
    public void wifiRange()
    {
        System.out.println("range-->100m");
    }
    public void openCamera()
    {
        System.out.println("opening the camera...");
    }
    public void takePic()
    {
        System.out.println("taking picture..");
    }
}
public class Interfaces_polymorphism {
  public static void main(String[] args) {
        
        // if user has only access to the camera not the wifi
        camera c=new SmartPhone2();
        c.openCamera();
        c.takePic();
        // c.wifiRange(); cannot access wifi

        // if user has only access to the wifi not the camera
        WiFi w=new SmartPhone2();
        w.wifiName();
        w.wifiRange();
        // w.openCamera(); cannot access the camera

        //  has access to both wifi and camera
        SmartPhone2 obj=new SmartPhone2();
        obj.wifiName();
        obj.wifiRange();
        obj.openCamera();
        obj.takePic();
  }
}
