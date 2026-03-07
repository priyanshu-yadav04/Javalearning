// print fizz on multiple of 3 and buzz on multiple of 5

class Main {
    public static void main(String[] args) {
        int counter3 = 0;
       int  counter5 =0;
        int N = 45;
        for(int i=1; i <= N; i++){
            counter3++;
            counter5++;
            if(counter3 != 3 && counter5!=5){
                
            System.out.println( i +" ");
            }
            else if(counter3==3){
                System.out.println("fizz ");
                counter3 =0;
            }
            else if(counter5==5){
                System.out.println("buzz ");
                counter5 =0;}
        }
    }
}