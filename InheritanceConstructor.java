class Base1
{
 public Base1(int x)
 {
  System.out.println("i am a base class constructor"+ x);
 }
}

class Derived1 extends Base1
{
 public Derived1(int x)
 {
  super(40);
  System.out.println("i am a derived class constructor"+ x);
 }
}

public class InheritanceConstructor
{
 public static void main(String[]args)
 {
   new Derived1(20);  
 }
}