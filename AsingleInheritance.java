public class AsingleInheritance
{
   public void methodA()
   {
     System.out.println("Base class method");
   }
public static class B extends AsingleInheritance
{
   public void methodB()
   {
     System.out.println("Child class method");
   }
   public  static void main (String args [])
   {
     B obj = new B();
     obj.methodAsingleInheritance(); //calling super class method
     obj.methodB(); //calling local method

}
private void methodAsingleInheritance() {
	// TODO Auto-generated method stub
	
}
}
}
