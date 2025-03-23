package wrappers;

public class ReverseOrderOfBits {

    public static void reverseOrderOfBits(int integer) {
        final int length = 8;
        final char paddingChar = '0';
        String format = "%" + paddingChar + length + "d";
        String binary = Integer.toBinaryString(integer);

        String binaryRepresentation = String.format(format, Integer.parseInt(binary));
        //String binaryRepresentation =  "0".repeat(length - binary.length()).concat(binary);

        String reversedBinary = new StringBuilder(binaryRepresentation).reverse().toString();

        int reversedInteger = Integer.parseInt(reversedBinary, 2);

        System.out.println("Entero original: " + integer);
        System.out.println("Representación en binario: " + binaryRepresentation);
        System.out.println("Binario invertido: " + reversedBinary);
        System.out.println("Entero invertido: " + reversedInteger);
    }


    public static void main(String[] args) {
        reverseOrderOfBits(14);
        reverseOrderOfBits(56);
        reverseOrderOfBits(234);
    }
}
