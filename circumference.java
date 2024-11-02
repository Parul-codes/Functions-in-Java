import java.util.*;

public class circumference {

    public static double circle(double r) {
        double result = 2*3.14*r;
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();

        System.out.println("The circumference of the circle of radius "+r+" is : "+circle(r));
    }
}
