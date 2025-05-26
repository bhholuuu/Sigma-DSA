public class binaryToDecimal{
    public static void btd(int a){
        int dec = 0, pow=0;
        while(a > 0){
            int ld=a%10;
            dec=dec+(ld*(int)Math.pow(2, pow));
            pow++;
            a=a/10;
        } 
        System.out.println(dec);
    }
    public static void main(String args[]){
        btd(101);
    }
}