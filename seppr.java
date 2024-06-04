class Person {
    String name;
    String address;
    String phoneNumber;
    String email;

    Person(String name) {
        this.name = name;
    }

    public String toString() {
        return "Person " + name;
    }
}

class Student extends Person {
    final String classStatus1 = "First Year";
    final String classStatus2 = "Second Year";
    final String classStatus3 = "Third Year";
    final String classStatus4 = "Fourth Year";

    Student(String name) {
        super(name);
    }

    public String toString() {
        return "Student " + name;
    }
}

class Employee extends Person {
    String office;
    String salary;

    Employee(String name) {
        super(name)
    }

    public String toString() {
        return "Employee " + name;
    }
}

class Faculty extends Employee {
    int officeHours;
    String rank;

    Faculty (String name){
        super(name);
    }

    public String toString() {
        return "Faculty " + name;
    }
}

class Staff extends Employee {
    String title;

    Staff(String name) {
        super(name);
    }

    public String toString() {
        return "Staff " + name;
    }
}

public class Main {
    public static void main(String[] args) {
        Person p = new Person("Aliza");
        Student std = new Student("Ali");
        Employee emp = new Employee("Ahmed");
        Faculty fclty = new Faculty("Ayesha");
        Staff staff = new Staff("hamza");

        System.out.println(p);
        System.out.println(std);
        System.out.println(emp);
        System.out.println(fclty);
        System.out.println(staff);
    }
}
