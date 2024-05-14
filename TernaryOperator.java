public class TernaryOperator{
    public static void main(String[] args) {
        //using if else to print even odd
        int num = 100;    // user value pehle se dedi yahan

        String result = "Undefined Number";     //result type (String) di hai kyun k answer string mein ayega (even,odd)
        
        result = num%2==0 ? "Even result" : "Odd result";
        System.out.println(result);
    }
}
