package Lr10.Example3;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class SearchLibrary {
    public void search(){
        Scanner in = new Scanner(System.in);
        try {
            JSONParser parser = new JSONParser();
            Object obj = parser
                    .parse(new FileReader("src/lr10/example3/example-json.json"));
            JSONObject jsonObject = (JSONObject) obj;
            System.out.println("Введите автора: ");
            String author = in.nextLine();
            JSONArray jsonArray = (JSONArray) jsonObject.get("books");
            for (Object o: jsonArray)
            {
                JSONObject book = (JSONObject) o;
                jsonArray.stream().filter(book1 -> book1 instanceof JSONObject)
                        .map(book1 -> (JSONObject) book)
                        .filter(book1 -> author.equals(book.get("author")))
                        .forEach(book1->{
                            System.out.println("Название книги: " + book.get("title"));
                            System.out.println("Автор: " + book.get("author"));
                            System.out.println("Год издания: " + book.get("year"));
                        });
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
