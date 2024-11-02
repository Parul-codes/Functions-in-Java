import java.util.*;

public class powers {

    public static int power(int x, int n) {
        int result=x;
        for(int i = 1; i<n; i++) {
            result = result*x;
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();

        System.out.println(power(x, n));
    }
}
