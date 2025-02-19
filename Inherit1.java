//program that illustrates single inheritance.//
class A
{
  int a;
  void displayA()
  {
    System.out.println("From class A, a="+a);
  }
}
class B extends A
{
   int b;
  void displayB()
{
     System.out.println("From class B, b="+b);
  }
}
class Inherit1
{
   public static void main (String args[])
{
   B b1 = new B();
   b1.a=10;b1.b=20;
   b1.displayA();
   b1.displayB();
}
}


