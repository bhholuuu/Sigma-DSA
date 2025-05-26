public class decimalToBinary {
    public static void dtb(int deci){
        int bin=0;
        while(deci>0){
            bin=bin*10;
            bin=bin+(deci%2);
            deci=deci/2;
        }
        System.out.println(bin);
    }
    public static void main(String args[]){
        dtb(5);
    }
}
