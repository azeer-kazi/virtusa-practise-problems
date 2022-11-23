interface Bicycle
{
    int a=50;
    void applyBrake();
    void speedUp();
    // deafault mehtod (used when new feature has to be added with affecting the fucntionality of other classes)
    default void tradeMark()
    {
        //private method can be called using default method 
        year();
        System.out.println("<<cycle>>");
    }

    private void year()
    {
      
        System.out.println("started the cycle company in 2001");
    }

}

class AoneCycle implements Bicycle
{
    //methods implemented from interfaces should always be cleared as public
    public void applyBrake()
    {
        System.out.println("Applying brake...");
    }

    public void speedUp()
    {
        System.out.println("speedin up the cycle...");
    }
}
public class Interfaces {
   
    public static void main(String[]args)
    {
     AoneCycle obj=new AoneCycle();
     obj.applyBrake();
     obj.speedUp();
     System.out.println("standard speed of the bicycle is "+AoneCycle.a+" km/h");
     // AoneCycle.a=60; we cannot change the property of an interface as it is final

     obj.tradeMark();
     // obj.year();  private method cannot be called outside the classes
    }
}
