import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean check;
        do {
            System.out.println("Введи какой-нибудь текст:");
            Scanner scanner = new Scanner(System.in);
            String text = scanner.nextLine();
            System.out.println("Ты ввел " + text);
            System.out.println("Еще раз? да\\нет");
            if (scanner.nextLine().toLowerCase().matches("да")) {
                check = true;
            }
            else {
                check = false;
                System.out.println("Пока");
            }
        } while (check);
    }
}
