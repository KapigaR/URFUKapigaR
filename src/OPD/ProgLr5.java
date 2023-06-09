package OPD;

import java.util.Scanner;

public class ProgLr5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите количество пользовательских экранов:");
        int userScreenAmount = in.nextInt();
        System.out.println("Введите количество обработчиков событий:");
        int eventHandlerAmount = in.nextInt();
        System.out.println("Введите количество новых бизнес-объектов:");
        int businessObjectAmount = in.nextInt();
        System.out.println("Введите количество новых или модифицируемых бизнес-методов");
        int businessMethodAmount = in.nextInt();
        System.out.println("Введите минимальное количество часов для разработки пользовательского экрана");
        int userScreenMin = in.nextInt();
        System.out.println("Введите максимальное количество часов для разработки пользовательского экрана");
        int userScreenMax = in.nextInt();
        System.out.println("Введите среднее количество часов для разработки пользовательского экрана");
        int userScreenProb = in.nextInt();
        System.out.println("Введите минимальное количество часов для разработки обработчика событий");
        int eventHandlerMin = in.nextInt();
        System.out.println("Введите максимальное количество часов для разработки обработчика событий");
        int eventHandlerMax = in.nextInt();
        System.out.println("Введите среднее количество часов для разработки обработчика событий");
        int eventHandlerProb = in.nextInt();
        System.out.println("Введите минимальное количество часов для разработки нового бизнес-объекта");
        int businessObjectMin = in.nextInt();
        System.out.println("Введите максимальное количество часов для разработки нового бизнес-объекта");
        int businessObjectMax = in.nextInt();
        System.out.println("Введите среднее количество часов для разработки нового бизнес-объекта");
        int businessObjectProb = in.nextInt();
        System.out.println("Введите минимальное количество часов для разработки нового или модифицируемого бизнес-метода");
        int businessMethodMin = in.nextInt();
        System.out.println("Введите максимальное количество часов для разработки нового или модифицируемого бизнес-метода");
        int businessMethodMax = in.nextInt();
        System.out.println("Введите среднее количество часов для разработки нового или модифицируемого бизнес-метода");
        int businessMethodProb = in.nextInt();

        int userScreenAmountMin = userScreenMin*userScreenAmount;
        int userScreenAmountMax = userScreenMax*userScreenAmount;
        int userScreenAmountProbably = userScreenProb*userScreenAmount;

        int eventHandlerAmountMin = eventHandlerMin*eventHandlerAmount;
        int eventHandlerAmountMax = eventHandlerMax*eventHandlerAmount;
        int eventHandlerAmountProbably = eventHandlerProb*eventHandlerAmount;

        int businessObjectAmountMin = businessObjectMin*businessObjectAmount;
        int businessObjectAmountMax = businessObjectMax*businessObjectAmount;
        int businessObjectAmountProbably = businessObjectProb*businessObjectAmount;

        int businessMethodAmountMin = businessMethodMin*businessMethodAmount;
        int businessMethodAmountMax = businessMethodMax*businessMethodAmount;
        int businessMethodAmountProbably = businessMethodProb*businessMethodAmount;

        int userScreenAmountWork = (userScreenAmountMax + 4*userScreenAmountProbably + userScreenAmountMin)/6;
        int userScreenAmountDeviation = (userScreenAmountMax-userScreenAmountMin)/6;

        int eventHandlerAmountWork = (eventHandlerAmountMax + 4*eventHandlerAmountProbably + eventHandlerAmountMin)/6;
        int eventHandlerAmountDeviation = (eventHandlerAmountMax-eventHandlerAmountMin)/6;

        int businessObjectAmountWork = (businessObjectAmountMax + 4*businessObjectAmountProbably + businessObjectAmountMin)/6;
        int businessObjectAmountDeviation = (businessObjectAmountMax - businessObjectAmountMin)/6;

        int businessMethodAmountWork = (businessMethodAmountMax + 4*businessMethodAmountProbably + businessMethodAmountMin)/6;
        int businessMethodAmountDeviation = (businessMethodAmountMax-businessMethodAmountMin)/6;

        int generalWork = userScreenAmountWork + eventHandlerAmountWork + businessObjectAmountWork + businessMethodAmountWork;
        int deviationMid = (userScreenAmountDeviation + eventHandlerAmountDeviation + businessMethodAmountDeviation + businessObjectAmountDeviation)/4;
        double generalDeviation = Math.sqrt((Math.pow((userScreenAmountDeviation-deviationMid),2) + Math.pow((eventHandlerAmountDeviation-deviationMid),2)
                + Math.pow((businessObjectAmountDeviation-deviationMid),2) + Math.pow((businessMethodAmountDeviation-deviationMid),2))/4);

        double sumGeneralWork = generalWork + 2*generalDeviation;
        double sumGeneralWorkError = (generalDeviation/generalWork)*100;

        double sumWorkProject = 4*sumGeneralWork;
        double reCalcHM = sumWorkProject/132;
        double BarryBoehm = 2.5*(Math.pow(reCalcHM,1.0/3));

        int teamAmount = (int)Math.ceil(reCalcHM/BarryBoehm);

        System.out.println("Средняя оценка трудоемкости для: пользовательского экрана - " + ((double)userScreenAmountWork/userScreenAmount) + " ч/час" +
                ", обработчика событий - " + ((double)eventHandlerAmountWork/eventHandlerAmount) + " ч/час" + ", нового бизнес-объекта - " +
                ((double)businessObjectAmountWork/businessObjectAmount) + " ч/час" + " и бизнес-метода - " + ((double)businessMethodAmountWork/businessMethodAmount) + " ч/час");
        System.out.println("Среднеквадратичное отклонение по формуле для: пользовательского экрана - " + ((double)userScreenAmountDeviation/userScreenAmount) + " ч/час" +
                ", обработчика событий - " + ((double)eventHandlerAmountDeviation/eventHandlerAmount) + " ч/час" + ", нового бизнес-объекта - " +
                ((double)businessObjectAmountDeviation/businessObjectAmount) + " ч/час" +
                " и бизнес-метода - " + ((double)businessMethodAmountDeviation/businessMethodAmount) + " ч/час");
        System.out.println("Суммарная трудоемкость кодирования проекта: " + generalWork + " ч/час");
        System.out.println("Среднеквадротичное отклонение: " + generalDeviation  + " ч/час");
        System.out.println("Оценка суммарной трудоемкости кодирования проекта: " + sumGeneralWork  + " ч/час");
        System.out.println("Относительная погрешность в оценке суммарной трудоемкости кодирования проекта: " + sumGeneralWorkError + " %");
        System.out.println("Общая трудоемкость проекта: " + sumWorkProject  + " ч/час");
        System.out.println("Перерасчет человеко-часов в человеко-месяцы: " + reCalcHM + " ч/мес");
        System.out.println("Оптимальная продолжительность проекта: " + BarryBoehm + " месяцев");
        System.out.println("Средняя численность команды: " + teamAmount + " человек");

    }
}
