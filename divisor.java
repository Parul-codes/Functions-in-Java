import java.util.*;

public class divisor {

    public static void greatestCommonDivisor(int a, int b) {
        if(a>b) {
            for(int i = a; i>=1; i--) {
                if(a%i == 0 && b%i == 0) {
                    System.out.println(i);
                    return;
                }
            }
        } else {
            for(int i = b; i>=1; i--) {
                if(a%i == 0 && b%i == 0) {
                    System.out.println(i);
                    return;
                }
            }
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        greatestCommonDivisor(a, b);
    }
}
