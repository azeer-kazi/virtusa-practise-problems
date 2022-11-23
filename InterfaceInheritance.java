interface Sample
{
    void method1();
}

interface childSample extends Sample
{
    void method2();
}

class MySample implements childSample
{
    public void method1()
    {
      System.out.println("method1 implemented..");
    }
    public void method2()
    {
      System.out.println("method2 implemented..");
    }
}
public class InterfaceInheritance {
    public static void main(String[] args) {
        MySample obj=new MySample();
        obj.method1();
        obj.method2();
    }
    
}
