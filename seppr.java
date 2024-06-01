class Person{
    String name;
    String address;
    String phoneNumber;
    String email;
    
    Person (String name, String address, String phoneNumber, String email) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    
    public String toString(){
        return "Person " + name;
    }
}

class Student extends Person{
    String classStatus = "Second Year";
    
    Student(String name, String address, String phoneNumber, String email, String classStatus){
        super(name,address,phoneNumber,email);
        this.classStatus = classStatus;
    }
    
    public String toString(){
        return "Student " + super.toSting();
    }
}


class Employee extends Person{
    String office;
    String salary;
    
    Employee(String name, String address, String phoneNumber, String email, String office, String salary){
        super(name,address,phoneNumber,email);
        this.office = office;
        this.salary = salary;
    }
    public String toString(){
        return "Employee " + super.toString();
    }
}


class Faculty extends Employee{
    int officeHours;
    String rank;
    
   Faculty(String name, String address, String phoneNumber, String email, int officeHours, String rank){
        super(name,address,phoneNumber,email);
        this.officeHours = officeHours;
        this.rank = rank;
   }
    public String toString(){
        return "Faculty " + super.toString();
    }
}


class Staff extends Employee{
    String title;
    
    Staff (String name, String address, String phoneNumber, String email, String title){
        super(name,address,phoneNumber,email);
        this.title = title;
    }
     public String toString(){
            return "Staff " + super.toString();
        }
}  


public class Main{
    public static void main (String[] args){
        Person p = new Person("Aliza");
        Student std = new Student();
        Employee emp = new Employee();
        Faculty fclty = new Faculty();
        Staff staff = new Staff();
        System.out.println(p);
        

        
        
    }
}

