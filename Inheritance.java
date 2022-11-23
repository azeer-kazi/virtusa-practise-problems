class Base
{
 public void bmethod()
 {
  System.out.println("i am a method of base class");
 }
}

class Derived extends Base
{
 public void dmethod()
 {
  System.out.println("i am method of derived class");
 }
}
public class Inheritance
{
 public static void main(String[]args)
 {
   Derived d=new Derived(); 
   d.dmethod();
   d.bmethod();
 }
}

