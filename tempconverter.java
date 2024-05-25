import java.util.Scanner;

class Temperature {
    //Declaring instance variable
    private double fTemp;

    //Zero argumented constructor
    public Temperature(double fTemp) {

        this.fTemp = fTemp;
    }

    // getters and setters
    public double getTemperature() {
        return fTemp;
    }

    public void setTemperature(double fTempin) {
        this.fTemp = fTempin;
    }
}

class TemperatureConverter{
    public static double CtoF(double celcius){
        return (celcius*(9/5))+32;
    }

    public static double FtoC(double farhenite){
        return (farhenite-32)*(9/5);
    }
}

public class TemperatureConvertertest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in Celcius");
        double Celcius =  sc.nextDouble();

        System.out.println("Enter temperature in Farhenite");
        double Fahrenheit =  sc.nextDouble();
        // Temperature temperature = new Temperature();
        // System.out.println("Temperature in Farhenite " + TemperatureConverter.CtoF(Celcius));
        System.out.println("Temperature in Celcius " + TemperatureConverter.FtoC(Fahrenheit));
    }
}


