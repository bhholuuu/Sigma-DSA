public class storeReverseNo {
    public static void main(String[] args) {
        int no = 12345;
        int rev = 0;
        while (no > 0) {
            rev = ((rev * 10) + no % 10);
            no = no / 10;
        }
        System.out.println(rev);
    }
}
