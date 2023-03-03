public class Temperature {
    public int celsius;
    public double fahrenheit;
    public double kelvin;

    public Temperature (int celsius){
        this.celsius = celsius;
        this.fahrenheit = fahrenheit;
        this.kelvin = kelvin;
    }
    public double getCelsiusToFahrenheit(){
        return fahrenheit = (celsius * 1.8) + 32;
    }
    public double getCelsiusToKelvin(){
        return kelvin = celsius + 273.15;
    }
}
