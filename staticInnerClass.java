class Parent{
    String name ="Baba";
    public String msg(){
        return "Parent class";
}
class child{                 //inner static hei means no need to create object
    String name ="Alizaa"; 
    public String msg(){
        return "Child class";
    }
}
}
public class MyClass {
    public static void main(String args[]) {
     Parent p = new Parent();               //IF ONLY INNER CLASS
    //  Parent.child c = new Parent.child();   // IF STATIC INNER CLASS
    Parent.child c = p.new child();

      System.out.println(c.msg() + " " + c.name);
    }
}
