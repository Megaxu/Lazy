import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean checkAnswer;
        do {
            System.out.println("Введи какой-нибудь текст:");
            Scanner scanner = new Scanner(System.in);
            String text = scanner.nextLine();
            System.out.println("Ты ввел " + text);
            System.out.println("Еще раз? да\\нет");
            if (scanner.nextLine().toLowerCase().matches("да")) {
                checkAnswer = true;
            }
            else {
                checkAnswer = false;
                timeToSleep();
                System.out.println("Пока");
            }
        } while (checkAnswer);
    }

    public static void timeToSleep() {
        Date time = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm");
        System.out.println(dateFormat.format(time));
    }
}
