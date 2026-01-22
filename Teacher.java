public class Teacher extends Person {

    private String subject;

    // Constructor
    public Teacher(String name, int age, String city, String subject) {
        super(name, age, city);
        this.subject = subject;
    }

    // Getter
    public String getSubject() {
        return subject;
    }

    // Override abstract method
    @Override
    public void introduce() {
        System.out.println("Hello! I'm " + getName() + ", I teach " + subject);
    }

    // Implement interface method
    @Override
    public void doWork() {
        System.out.println(getName() + " is teaching " + subject + " class.");
    }

    // Override displayInfo
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Subject: " + subject);
        System.out.println();
    }

    // Method overloading
    public void teach() {
        System.out.println(getName() + " is teaching.");
    }

    public void teach(String topic) {
        System.out.println(getName() + " is teaching " + topic);
    }
}
