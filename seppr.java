class Person {
    String name;
    String address;
    String phoneNumber;
    String email;

    Person(String name, String address, String phoneNumber, String email) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String toString() {
        return "Person " + name;
    }
}

class Student extends Person {
    String classStatus = "Second Year";

    Student(String name, String address, String phoneNumber, String email, String classStatus) {
        super(name, address, phoneNumber, email);
        this.classStatus = classStatus;
    }

    public String toString() {
        return "Student " + name;
    }
}

class Employee extends Person {
    String office;
    String salary;

    Employee(String name, String address, String phoneNumber, String email, String office, String salary) {
        super(name, address, phoneNumber, email);
        this.office = office;
        this.salary = salary;
    }

    public String toString() {
        return "Employee " + name;
    }
}

class Faculty extends Employee {
    int officeHours;
    String rank;

    Faculty (String name, String address, String phoneNumber, String email, int officeHours, String rank, String office, String salary){
        super(name, address, phoneNumber, email, salary, office);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public String toString() {
        return "Faculty " + name;
    }
}

class Staff extends Employee {
    String title;

    Staff(String name, String address, String phoneNumber, String email, String title, String office, String salary) {
        super(name, address, phoneNumber, email, office, salary);
        this.title = title;
    }

    public String toString() {
        return "Staff " + name;
    }
}

public class Main {
    public static void main(String[] args) {
        Person p = new Person("Aliza", "0321", "karachi", "aliza@gmail.com");
        Student std = new Student("Ali", "0321", "karachi", "aliza@gmail.com", "Second year");
        Employee emp = new Employee("Ahmed", "0321", "karachi", "aliza@gmail.com", "UBIT office", "50000pkr");
        Faculty fclty = new Faculty("Ayesha", "0321", "karachi", "aliza@gmail.com", 3, " 17th rank","ubit office", "180lacs");
        Staff staff = new Staff("hamza", "0321", "karachi", "aliza@gmail.comm", "Assistant","ned office","30000pkr");

        System.out.println(p);
        System.out.println(std);
        System.out.println(emp);
        System.out.println(fclty);
        System.out.println(staff);
    }
}
