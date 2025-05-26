public class PrimeInRange {
    public static void primeIs(int a, int b){
        for(int i = a; i <= b; i++){
            if (i < 2) continue; // 0 and 1 are not prime

            boolean isPrime = true;
            for(int j = 2; j <= Math.sqrt(i); j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(i);
            }
        }
    }

    public static void main(String args[]){
        primeIs(10, 50);
    }
}
