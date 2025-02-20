class Methodover
{
   int sum(int a,int b)
 { 
     return(a+b);
}
int sum(int a,int b,int c)
 { 
     return(a+b);
}
}
class Methodover1
{
   public static void main(String args[])
{
    Methodover m1=new Methodover();
    int x=m1.sum(10,20);
    System.out.println("sum of 10 and 20 is"+x);
    int y=m1.sum(43,67);
   System.out.println("sum of 11.43 and 20  is "+x);
}
}
