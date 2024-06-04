class parent{
    String name ="Baba";
    public String msg(){
        return "Parent class";
    }
}

class child extends parent{
    String name ="Alizaa";
    public String msg(){
        return "Child class";
    }
}

public class MyClass {
    public static void main(String args[]) {
     parent p = new child();       //new k saath jo hota method uska 
                                   //variable hamesha parent ka

      System.out.println(p.name + " " + p.msg());
    }
}
