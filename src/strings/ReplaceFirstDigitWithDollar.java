package strings;

public class ReplaceFirstDigitWithDollar {

    public static String replaceFirstDigitWithDollar(String input) {
        boolean foundDigit = false;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if(Character.isDigit(c) && !foundDigit) {
                sb.append("$");
                foundDigit = true;
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String original ="abc123xyz456";
        String modified = replaceFirstDigitWithDollar(original);
        System.out.println("Original: " + original);
        System.out.println("Modificada: " + modified);
    }
}
