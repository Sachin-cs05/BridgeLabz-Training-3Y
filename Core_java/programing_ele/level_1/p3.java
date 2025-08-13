import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance in km: ");
        double km = sc.nextDouble();

        double miles = km / 1.6;
        System.out.println("The distance " + km + " km in miles is " + miles);
    }
}
