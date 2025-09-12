// Base class
class Course {
    String courseName;
    int duration;

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public void displayInfo() {
        System.out.println("Course: " + courseName + ", Duration: " + duration + " weeks");
    }
}

// Subclass 1
class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Platform: " + platform + ", Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}

// Subclass 2 (multilevel)
class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount;

    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Fee: $" + fee + ", Discount: " + discount + "%");
    }
}

public class CourseDemo {
    public static void main(String[] args) {
        Course c1 = new Course("Data Structures", 10);
        c1.displayInfo();

        OnlineCourse c2 = new OnlineCourse("Java Programming", 12, "Udemy", true);
        c2.displayInfo();

        PaidOnlineCourse c3 = new PaidOnlineCourse("Full-Stack Development", 24, "Coursera", true, 499.99, 20);
        c3.displayInfo();
    }
}
