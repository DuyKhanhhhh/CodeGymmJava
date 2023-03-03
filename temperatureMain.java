import java.util.Scanner;

public class temperatureMain {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter the Celsius: ");
        int celsius = scanner.nextInt();
        Temperature temperature = new Temperature(celsius );
        System.out.println("Celsius to Fahrenheit: " + temperature.getCelsiusToFahrenheit());
        System.out.println("Celsius to Kelvin: " + temperature.getCelsiusToKelvin());
    }
}
