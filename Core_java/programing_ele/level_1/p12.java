import java.util.Scanner;

public class p12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base in inches: ");
        double baseInches = sc.nextDouble();

        System.out.print("Enter height in inches: ");
        double heightInches = sc.nextDouble();

        double areaInInches = 0.5 * baseInches * heightInches;
        double areaInCm = areaInInches * 6.4516; // 1 sq inch = 6.4516 sq cm

        System.out.println("The area of the triangle is " + areaInInches + " square inches and " + areaInCm + " square centimeters.");
    }
}
