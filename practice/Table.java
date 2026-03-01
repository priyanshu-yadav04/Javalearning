import java.util.*;
public class Table{
    public static void main(String args[]){

    Scanner sc = new Scanner(System.in);  
    System.out.println("Enter a number for multiplication table:");
    int N = sc.nextInt();
    for (int i = 1; i <=10; i++) {
        int Table = N * i;
        System.out.println(N + " * " +i+" = "+ Table);
        
    }
    
    }
}