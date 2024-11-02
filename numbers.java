import java.util.*;

public class numbers {

    public static void numbersOfNumbers(int n) {
        int num, positive = 0, negative = 0, zeroes = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter "+n+" numbers : ");
        for(int i=1;i<=n;i++) {
            num = sc.nextInt();
            if (num > 0) {
                positive++;
            } else if(num<0) {
                negative++;
            } else {
                zeroes++;
            }
        }
        System.out.println("Number of positives are : "+positive+" Number of negatives are : "+negative+" Number of zeroes are : "+zeroes);
    }
    public static void main(String[] args) {
        System.out.println("Enter the number of inputs u want to give : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        numbersOfNumbers(n);
    }
}
