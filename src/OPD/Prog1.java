package OPD;

import java.util.Scanner;

public class Prog1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите желаемый срок выполнения проекта в месяцах:");
        double monthAmount = in.nextDouble();

        System.out.println("Введите желаемый бюджет проекта в долларах:");
        double priceProject = in.nextDouble();

        System.out.println("Введите желаемый месяц проверки проекта:");
        double monthCheck = in.nextDouble();

        System.out.println("Введите процент готовности проекта на момент проверки:");
        double percentDone = in.nextDouble();

        System.out.println("Введите потраченнную сумму от бюджета на момент проверки");
        double priceCheck = in.nextDouble();

        double monthDone = (monthCheck * 100)/percentDone;
        double monthDelay = monthDone-monthAmount;
        double overprice = (priceCheck * 100)/percentDone - priceProject;

        System.out.println("Срок задержки проекта от запланированного: " + monthDelay + " мес.");
        System.out.println("Перерасход от запланированной суммы: " + overprice + " У.Е.");
    }
}
