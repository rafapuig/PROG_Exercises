package wrappers;

import java.util.Scanner;

public class AddTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = readNumber(scanner, "Introduce el primer numero: ");
        int num2 = readNumber(scanner, "Introduce el segundo numero: ");

        int suma = num1 + num2;
        System.out.println("Suma: " + suma);
    }

    static int readNumber(Scanner scanner, String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                String input = scanner.nextLine();
                int number = Integer.parseInt(input);
                return number;
            } catch (NumberFormatException e) {
                System.out.println("No has introducido un número entero");
            }
        }
    }

}
