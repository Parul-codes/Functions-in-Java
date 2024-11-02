import java.util.*;

public class average {

    public static int averageOfThreeNumbers(int a, int b, int c) {
        int avg = (a+b+c)/3;
        System.out.println("Your average of 3 numbers is : "+avg);

        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        averageOfThreeNumbers(a, b, c);
    }
}
