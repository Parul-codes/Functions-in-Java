import java.util.*;

public class sumodd {

    public static int sumOfNOddNumbers(int n) {
        int sum = 0;
        for(int i =1; i<=n; i++) {
            if(i%2!=0) {
                sum = sum + i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("The sum of "+n+" Odd numbers is : "+ sumOfNOddNumbers(n));
    }
}
