import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Entre com a temperatura em ºC: ");
        float celsius = input.nextFloat();

        double fahrenheit = (celsius * 1.80) + 32;
        double kelvin = (celsius + 273.15);

        System.out.println("você digitou: " + celsius + "ºC");
        System.out.println("Equivale: " + fahrenheit + "ºF");
        System.out.println("Equivale: " + kelvin + "K");
        input.close();
    }
}
