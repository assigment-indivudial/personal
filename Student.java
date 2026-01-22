public class Student extends Person {

    private String studentId;

    // Constructor
    public Student(String name, int age, String city, String studentId) {
        super(name, age, city);
        this.studentId = studentId;
    }

    // Getter
    public String getStudentId() {
        return studentId;
    }

    // Override abstract method
    @Override
    public void introduce() {
        System.out.println("Hi! I'm " + getName() + ", a student with ID: " + studentId);
    }

    // Implement interface method
    @Override
    public void doWork() {
        System.out.println(getName() + " is studying and doing homework.");
    }

    // Override displayInfo
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Student ID: " + studentId);
        System.out.println();
    }

    // Method overloading
    public void study() {
        System.out.println(getName() + " is studying.");
    }

    public void study(String subject) {
        System.out.println(getName() + " is studying " + subject);
    }
}
