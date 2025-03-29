public class printRevenseNo {
    public static void main(String[] args) {
        int no = 12345;
        while (no > 0) {
            System.out.print(no % 10);
            no = no / 10;
        }
    }
}
