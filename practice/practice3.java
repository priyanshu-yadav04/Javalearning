import java.util.*;
public class practice3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.err.println("how many total numbers you goona enter");
        int N = sc.nextInt();
        int oddsum = 0;
        int evensum = 0;
        for(int i = 0;i<N; i++){
            int ele = sc.nextInt();
            if(ele %2 == 0){
                evensum += ele;
            }
            else{
                oddsum = oddsum+ele;
            }


        }
        System.err.println("sum of all even numbers:   "+evensum);
        System.err.println("sum of all odd numbers :   "+oddsum);
    

    }
}