package Lr10.Example3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JsonMain {
    public static void main(String[] args) {
        System.out.println("Что вы хотите сделать с вашей библиотекой?");
        System.out.println("1: Посмотреть текущую библиотеку");
        System.out.println("2: Положить новую книгу");
        System.out.println("3: Убрать книгу из библиотеки");
        System.out.println("4: Найти книгу по автору");
        System.out.println();
        System.out.println("Выберите пункт(1-4): ");
        Scanner scanner = new Scanner(System.in);
        try {
            int userChange = 0;
            userChange = scanner.nextInt();
            if (userChange == 2) {
                Lr10.Example3.CreateNewBook newBook = new Lr10.Example3.CreateNewBook();
                newBook.create();}
            if (userChange == 1) {
                MonitorLibrary parser = new MonitorLibrary();
                parser.monitor();}
            if (userChange == 3){
                Lr10.Example3.DeleteBook deleteBook = new Lr10.Example3.DeleteBook();
                deleteBook.delete();}
            if (userChange == 4){
                SearchLibrary searchBook = new SearchLibrary();
                searchBook.search();}
        } catch (InputMismatchException e){
            System.out.println("Вы ввели некорректное значение");
        }
    }
}
