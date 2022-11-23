abstract class Parent
{
 public void name()
 {
  System.out.println("i am methhod of parent class");
 }
 abstract public void greet();
}

class Child extends Parent
{
 @Override
 public void greet()
 {
  System.out.println("hello good morning");
 }
 public void name2()
 {
  System.out.println("i am a method of Child class");
 }
}

class Child2 extends Parent  // Override a method of an abstract class or make that class as abstract if the method is not overided
{
 @Override
 public void greet()
 {
   System.out.println("hello hi");
 }
}



public class Abstraction
{
 public static void main(String[]args)
 {
   Child obj=new Child();
   obj.name();
   Parent p=new Child(); //we can create refrence of abstarct class but cannot create object of an abstract class
   p.name();
   obj.name2();
 }
}