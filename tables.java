import java.util.*;

public class tables {

    public static int table(int n) {
        System.out.println("The table of "+n+" is : ");
        for(int i = 1; i<=10; i++) {
            System.out.println(n+" x "+i+" = "+i*n);
        }
        
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        table(n);
    }
}
