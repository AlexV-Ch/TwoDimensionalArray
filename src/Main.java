import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        while (true) {
            System.out.println("Введите число: ");
            String text = new Scanner(System.in).nextLine();
            int drawing = Integer.parseInt (text.trim ());
            TwoDimensionalArray.getTwoDimensionalArray(drawing);

        }
    }
}
