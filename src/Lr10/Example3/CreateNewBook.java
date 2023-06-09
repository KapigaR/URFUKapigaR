package Lr10.Example3;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class CreateNewBook {
    public void create(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название книги: ");
        String title = in.nextLine();
        System.out.println("Введите автора: ");
        String author = in.nextLine();
        System.out.println("Введите год издания: ");
        String year = in.nextLine();
        JSONParser parser = new JSONParser();
        Object obj = null;
        try {
            obj = parser
                    .parse(new FileReader("src/lr10/example3/example-json.json"));
        } catch (IOException | ParseException e) {
            throw new RuntimeException(e);
        }

        JSONObject library =  (JSONObject) obj;
        JSONArray books = (JSONArray) library.get("books");
        JSONObject newBook = new JSONObject();
        newBook.put("title", title);
        newBook.put("author", author);
        newBook.put("year", year);
        books.add(newBook);

        library.put("books",books);
        try(FileWriter file = new FileWriter("src/lr10/example3/example-json.json"))
        {
            file.write(library.toJSONString());
            System.out.println("Новая книга добавлена.");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}