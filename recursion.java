import java.util.*;

public class recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = sum(n);
        System.out.println(result);
    }
    public static int sum(int k) { //The function is calling itself
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }
}
