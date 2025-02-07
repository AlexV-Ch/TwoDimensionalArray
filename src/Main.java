import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        while (true) {

            Scanner scanner = new Scanner(System. in);
            int number;
            try {
                System. out. println("Введите целое число от 1 до 50:");
                number = scanner. nextInt();
                if (number >= 1 && number <= 50) {
                    TwoDimensionalArray.getPrintArray(TwoDimensionalArray.getTwoDimensionalArray(number));
                } else {
                    System.out.println("Вы вышли за пределы диапазона");
                }
            } catch (java.util.InputMismatchException e) {
                System. out. println("Ошибка ввода! Введено некорректное значение.");
            }


//            System.out.println("Введите число от 1 до 50: ");
//            int parameter = new Scanner(System.in).nextInt();
//            if (parameter >= 1 && parameter <= 50) {
//                TwoDimensionalArray.getPrintArray(TwoDimensionalArray.getTwoDimensionalArray(parameter));
//            } else {
//                System.out.println("Вы ошиблись при вводе");
//            }
//

            //String text = new Scanner(System.in).nextLine();
            //text = text.replaceAll("[^0-9]", "");
            //if (text.length() > 2 || text.length() < 1) {
            //    System.out.println("Вы ошиблись при вводе");
            //} else {
            //    int drawing = Integer.parseInt(text.trim());
            //    TwoDimensionalArray.getPrintArray(TwoDimensionalArray.getTwoDimensionalArray(drawing));
            //}

        }
    }
}
