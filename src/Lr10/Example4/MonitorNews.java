package Lr10.Example4;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;

public class MonitorNews {
    public static void main(String[] args) {
        try {
            JSONParser parser = new JSONParser();
            Object obj = parser
                    .parse(new FileReader("src/lr10/example4/news.json"));
            JSONObject jsonObject = (JSONObject) obj;
            JSONArray jsonArray = (JSONArray) jsonObject.get("htmlNews");

            for (Object o: jsonArray){
                JSONObject htmlNews = (JSONObject) o;
                System.out.println("ТЕМА: " + htmlNews.get("theme"));
                System.out.println("ДАТА: " + htmlNews.get("data"));
            }

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
