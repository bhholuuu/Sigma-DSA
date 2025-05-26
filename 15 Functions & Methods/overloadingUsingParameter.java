public class overloadingUsingParameter {
    public static int sum(int a, int b){
        int add=a+b;
        return add;
    }
    public static int sum(int a, int b, int c){
        int add=a+b+c;
        return add;
    }
    public static void main(String args[]){
        int a=1,b=2,c=3;
        System.out.println("add of 2 = " + sum(a, b));
        System.out.println("add of 3 = " + sum(a, b, c));
    }
}
