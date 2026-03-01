import java.util.*;

public class JavaBasics{
    public static void main(String args[]){
    //  Scanner sc = new Scanner(System.in);
    //  System.out.println("enter a number");
    //  int A = sc.nextInt();
    //  System.out.println("enter second number");
    //  int B = sc.nextInt();
    //  System.out.println("addition ="+(A + B));
    //  System.out.println("substraction ="+(A - B));

    //  System.out.println("multiply ="+ (A * B));
    //  System.out.println("division="+(A/B));
    //  System.out.println("modulo/remainder="+(A%B));


    
    // int  a = 10;
    // int b = a++;
    // int c = a-- ;

    // System.out.println(a);
    // System.out.println(b);
    // System.out.println(c);
      

      // int a = 20;
      // a  %= 10;

      // System.out.println(a);

      Scanner sc = new Scanner(System.in);
      
      System.out.println("enter a value");
      int a= sc.nextInt();
      System.out.println("enter a another value");
      int b = sc.nextInt();
      System.out.println("enter operator to perform");
      char operator= sc.next().charAt(0);
      switch (operator){
        case '+':System.out.println(a+b);
                    break;
        case '-' : System.out.println(a-b);
                     break;
        case '*': System.out.println(a*b);
                    break;
        case '/':System.out.println(a/b);
                    break;
        case '%': System.out.println("a%b");
                    break;
        default:System.out.println("wronng operator");
         

      }

    }
}
