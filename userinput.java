import java.util.Scanner;

class main{
    String name;
}

public class userinput{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");          //User prompt
        String name = sc.nextLine();                     //prints complete string    >>>Aliza Khan 
        sc.close();
        System.out.println("Name = " + name);
    }                      
}


 String name = sc.next();     //prints single word
      // >>>aliza
