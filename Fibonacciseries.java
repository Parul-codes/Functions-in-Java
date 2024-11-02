import java.util.*;

public class Fibonacciseries {

    public static void Fibonacci(int n) {
        int a =0, b =1;
        int i =1;
        System.out.print(a+" "+b+" ");
        do {
            int temp = b;
            b = a+b;
            a = temp;
            System.out.print(b+" ");
            i++;
        } while(i<=n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Fibonacci(n);
    }
}
 