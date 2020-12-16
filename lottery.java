import java.util.Random;
import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int[] enteredNumber = new int[3];
        int choice = 0;
        System.out.println("Привет! Надеюсь сегодня тебе повезёт!!!");


//Загадываем числа
        do {
            System.out.println(choice == 0? "Начнём......!" : "Так держать!!! Продолжаем...");
            int[] hiddenNumber = new int[3];
            for (int i = 0; i < 3; i++) {
                hiddenNumber[i] = random.nextInt(22);
                if (hiddenNumber[i] == 0) {
                    i--;

                }
            }


//Вводим числа
            System.out.println("Введите 3 числа от 1 до 21: ");
            for (int i = 0; i < 3; i++) {
                System.out.print("ВВедите число номер " + (i + 1) + ": ");
                enteredNumber[i] = scanner.nextInt();
                if (enteredNumber[i] > 21 || enteredNumber[i] < 1) {
                    System.out.println("Вы ввели неверное число!!!");
                    i--;

                }
            }

//Считаем совпадения
            int numOfMatches = 0;
            for (int i = 0; i < 3; i++) {
                if (enteredNumber[i] == hiddenNumber[0]) {
                    numOfMatches++;
                }
                if (enteredNumber[i] == hiddenNumber[1]) {
                    numOfMatches++;
                }
                if (enteredNumber[i] == hiddenNumber[2]) {
                    numOfMatches++;
                }
            }

//Выводим результат
            System.out.println(numOfMatches == 0 ? "К сожалению ты проиграл(а)..." : ("Поздравляю у тебя " + numOfMatches + " совпадений!!!"));
            System.out.println("Загаданные числа:" + hiddenNumber[0] + " " + hiddenNumber[1] + " " + hiddenNumber[2]);
            System.out.print("Хочешь сыграть заново? Да-1; Нет-0; ");
            choice = scanner.nextInt();
            System.out.println(choice == 0? "Надеюсь ты вернёшься..." : "");
        } while (choice == 1);
    }
}
