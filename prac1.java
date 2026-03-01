import java.util.*;

public class prac1{
    public static void main(String args[]){
    //     // int n =22804;
    //     // int rev = 0;

        
    //     // while (n>0){
    //     //     int lastdigit = n % 10;
    //     //     // System.out.println(lastdigit);
    //     //     rev =(rev*10)+lastdigit;
    //     //     n/=10;

    //     // }
    //  System.out.println(rev);
    Scanner sc = new Scanner(System.in);
    do { 
        System.out.println("enter a number");
        int num =sc.nextInt();
        if (num %10 == 0) {
            continue;
            
        }

        System.out.println("number was" +num);

    } while (true);

    }
}