import java.util.*;

public class primenumbers {

    public static void prime(int n) {
        boolean isPrime = true;
        for(int i = 2; i<n; i++) {
            if(n%i==0) {
                isPrime = false;
                break;
            } else {
                isPrime = true;
            }
        }
        if(isPrime == true) {
            System.out.println(n+" is a Prime number");
        } else {
            System.out.println(n+" is not a Prime Number");
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        prime(n);
    }
}