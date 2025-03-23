package strings;

public class PyramidPattern {

    public static void generateAsciiTriangle(int height) {
        for (int i = 1; i <= height; i++) {
            String spaces = " ".repeat(height - i);
            String stars = "*".repeat(i * 2 - 1);
            System.out.println(spaces + stars);
        }
    }

    public static void main(String[] args) {
        int triangleHeight = 5;
        generateAsciiTriangle(triangleHeight);
    }
}
