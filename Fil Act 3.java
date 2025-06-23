//Fil.java

class Fil {
    String name;
    int id;

    public Fil(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

//Student.java

class Student extends Fil {
    String gradeLevel;

    public Student(String name, int id, String gradeLevel) {
        super(name, id);
        this.gradeLevel = gradeLevel;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Grade Level: " + gradeLevel);
    }
}

//Teacher.java

class Teacher extends Fil {
    String subject;

    public Teacher(String name, int id, String subject) {
        super(name, id);
        this.subject = subject;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Subject: " + subject);
    }
}

//Staff.java

class Staff extends Fil {
    String department;

    public Staff(String name, int id, String department) {
        super(name, id);
        this.department = department;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }
}

public class SchoolTest extends Fil {
    public static void main(String[] args) {
        Student student = new Student("Anna Cruz", 101, "Grade 10");
        Teacher teacher = new Teacher("Mr. Reyes", 201, "Mathematics");
        Staff staff = new Staff("Ms. Dela Cruz", 301, "Administration");

        System.out.println("--- Student Info ---");
        student.displayInfo();

        System.out.println("\n--- Teacher Info ---");
        teacher.displayInfo();

        System.out.println("\n--- Staff Info ---");
        staff.displayInfo();
    }
}