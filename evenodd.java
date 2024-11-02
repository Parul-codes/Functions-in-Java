import java.util.*;

public class evenodd {

    public static int even(int n) {
        if(n%2==0) {
            System.out.println(n+" is an even number");
        } else {
            System.out.println(n+" is an odd number");
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        even(n);
    }
}
