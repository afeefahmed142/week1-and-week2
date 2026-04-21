import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input temperature in Celsius
        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();

        // Convert to Fahrenheit
        double fahrenheitResult = (celsius * 9/5) + 32;

        // Output
        System.out.println("The " + celsius + " celsius is " + 
                           fahrenheitResult + " fahrenheit");

        sc.close();
    }
}
