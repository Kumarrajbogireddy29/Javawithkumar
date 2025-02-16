import java.util.Scanner;
class Factorial{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num = scanner.nextInt();
        int fact=1;

        for(int i=0;i<=num;i++){
            fact *=i;
        }
        System.out.println("The Factorial of num is " + num + fact);


    }
}