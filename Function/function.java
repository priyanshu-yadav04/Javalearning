
import java.util.Scanner;

public class function{
    public static int multiply( int a, int b){//function for product
        int product = a*b;
       
        return product;

    }public static long factorial(int n){
        long fact=1;
        for (int i = 1; i <= n; i++) {
            fact = fact*i;


            
        }
        return fact;

    }
    public static long Bincoeff(int n, int r){
        
        long nCr = factorial(n)/factorial(r)*factorial(n-r);
        return nCr;

    }


    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        int product = multiply(3 ,5);//calling function multiply by using arguments
        System.out.println(product);
        System.out.println(" enter a number to find factorial");
        int a = sc.nextInt();

        System.out.println("factorial is :  "+ factorial(a)); //calling function factorial



    // finding binomial coefficient
    System.out.println("to find binomial coefficient enter value of n :");
    int n = sc.nextInt();
    System.out.println("enter r:      ");
    int r = sc.nextInt();
    System.out.println("nCr is :"+ Bincoeff(n, r));
    }

}