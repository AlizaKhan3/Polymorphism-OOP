
//An interface is a complete abstract class
//by defaulf it have "public abstract" so no need to write
//OBJECT of an  interface class  cannot be created
//Applicable on class only
//to implement interface on other class use keyword iMPLEMENTS
//define a normal class separately when implements


interface completeabst {             
    void dog();               //Interface have by default "Public abstract"
    void cat();
}
//Interface class alag band hogi

//normal class
class Animal implements completeabst{
    public void dog(){
        System.out.println("dog barks");
    }
    public void cat(){
        System.out.println("meowwww...");
    }
}

public class test{
    public static void main(String[] args) {
        Animal obj = new Animal();
        obj.cat();
        obj.dog();
    }
}
