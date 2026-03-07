public class BinaryToDecimal{
    public static void BintoDec(int binNum){
    int n = binNum;
           int power =0;
        int decNum = 0;
        while(binNum > 0){
            int Lastdigit =  binNum % 10;
            decNum = decNum + (Lastdigit* (int)Math.pow(2,power));
            power++;
            binNum = binNum/10;


        }
        System.out.println("the decimalvalue of "+ n + "is :  " +decNum);


    }
    public static void main(String[] args) {
        BintoDec(101010);
     
        
    }
}