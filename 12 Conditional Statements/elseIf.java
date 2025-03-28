public class elseIf {
    public static void main(String[] args) {
        int age = 233;
        if (age < 18 && age > 10) {
            System.out.println("minor");
        } else if (age >= 18 && age < 25) {
            System.out.println("adult");
        } else {
            System.out.println("elder");
        }
    }
}