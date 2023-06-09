package Lr10.Example4;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.FileWriter;
import java.io.IOException;
import java.net.UnknownHostException;

public class ParseHtmlToJSON {

    public static void main(String[] args)  throws InterruptedException, IOException {

        JSONObject htmlNews = new JSONObject();
        JSONArray news = new JSONArray();

        for (var t = 0; t < 3; t++) {
            Document doc = null;
            try {
                doc = Jsoup.connect("http://fat.urfu.ru/index.html").get();
            } catch (UnknownHostException e) {
                Thread.sleep(1000);
                continue;
            } catch (IOException e) {
                e.printStackTrace();
            }

            if (doc == null) {
                return;
            }

            var newsParent = doc.select(
                    "body > table > tbody > tr > td > div > table > " + "tbody > tr:nth-child(5) > td:nth-child(3) > table > tbody > " + "tr > td:nth-child(1)");


            try (var fileWriter = new FileWriter("src/lr10/example4/news.json")) {
                for (var i = 3; i < 20; i++) {
                    if (i % 2 == 1) {
                        var nodes = newsParent.get(0).childNodes();
                        var title = ((Element) nodes.get(i)).getElementsByClass("blocktitle").get(0).childNodes().get(0);
                        var date = ((Element) nodes.get(i)).getElementsByClass("blockdate").get(0).childNodes().get(0);

                        String titleNormal = String.valueOf(title);
                        String dateNormal = String.valueOf(date);

                        JSONObject news1 = new JSONObject();
                        news1.put("theme", titleNormal);
                        news1.put("data", dateNormal);

                        news.add(news1);

                        htmlNews.put("htmlNews", news);


                    }
                }
            }
        }
            try (FileWriter file = new FileWriter("src/lr10/example4/news.json")) {
                file.write(htmlNews.toJSONString());
                System.out.println("Данные сохранены в JSON файл!");
            } catch (Exception e) {
                e.printStackTrace();
            }
    }
}
