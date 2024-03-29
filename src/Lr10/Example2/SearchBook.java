package Lr10.Example2;

import java.io.File;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchBook {
    public void search() {
        try {
            File inputFile = new File("src/lr10/example2/example.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            XPathFactory xpathFactory = XPathFactory.newInstance();
            XPath xpath = xpathFactory.newXPath();
            doc.getDocumentElement().normalize();
            List<String> search = getAuthor(doc, xpath);
            System.out.println("Книги автора:" +
                    search);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    private static List<String> getAuthor(Document doc, XPath xpath) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите автора: ");
        String auth = in.nextLine();
        List<String> list = new ArrayList<>();
        try {
            XPathExpression xPathExpression = xpath.compile(
                    "/Library/book[author='" + auth + "']/title/text()"
            );
            NodeList nodes = (NodeList) xPathExpression.evaluate(doc, XPathConstants.NODESET);
            for (int i = 0; i < nodes.getLength(); i++)
                list.add(nodes.item(i).getNodeValue());
        } catch (XPathExpressionException e) {
            e.printStackTrace();
        }
        return list;
    }

    }
