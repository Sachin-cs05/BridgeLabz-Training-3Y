import java.util.Scanner;

public class p5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total pens: ");
        int totalPens = sc.nextInt();
        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        int perStudent = totalPens / students;
        int remaining = totalPens % students;

        System.out.println("The Pen Per Student is " + perStudent + " and the remaining pen not distributed is " + remaining);
    }
}
