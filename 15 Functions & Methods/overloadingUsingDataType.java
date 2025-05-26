public class overloadingUsingDataType {
    public static int add(int a, int b){
        return a+b;
    }
    public static float add(float a, float b){
        return a+b;
    }
    public static void main (String args[]){
        int a=1, b=2;
        float x=1.2f,y=2.3f;
        System.out.println("sum of int = " + add(a,b));
        System.out.println("sum of float = " + add(x,y));
    }
}
