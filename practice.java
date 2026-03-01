import java.util.* ;
public class practice{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();

        int B = sc.nextInt();

        int C = sc.nextInt();


        double Average = (A + B + C) /  3.0;
        System.out.println("Average ="+Average);
        double x, y, z;x = y = z = 2;x += y;y -= z;z /= (x + y);System.out.println(x + " " + y + " " + z);
    }
}