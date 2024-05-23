package interview;

public class primeNumber {

    public static boolean isPrime(int n){
        if (n<=1){
            return false;
        }
        for (int i=2;i<=Math.sqrt(n);i++){
            if (n%i==0){
                return false;
            }
        }
return true;
    }

    public static void PrintPrimeNumber(int start,int end){
        for (int i = start; i < end; i++) {
            if (isPrime(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {

        int start=1;
        int end=12;
        System.out.println("Prime number betweet "+start +" to "+end);
        PrintPrimeNumber(start,end);
    }
}
