import java.util.Scanner;

public class p2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Maths marks: ");
        double maths = sc.nextDouble();
        System.out.print("Enter Physics marks: ");
        double physics = sc.nextDouble();
        System.out.print("Enter Chemistry marks: ");
        double chemistry = sc.nextDouble();

        double average = (maths + physics + chemistry) / 3;
        System.out.println("Sam’s average mark in PCM is " + average);
    }
}