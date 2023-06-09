package TestPack;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.IOException;


public class HTMLtoJSON {

    public static void main(String[] args) throws  InterruptedException, IOException{

        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newDefaultInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse("https://cbr.ru/scripts/XML_daily.asp?date_req=03/06/2023.xml");
            doc.getDocumentElement().normalize();
            NodeList nodelist = doc.getElementsByTagName("Valute");
            for (int i=0; i < nodelist.getLength();i++){
                Node node = nodelist.item(i);
                System.out.println("\nТекущий элемент: " + node.getNodeName());
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    System.out.println("CharCode: "
                            + element.getElementsByTagName("CharCode").item(0)
                            .getTextContent());
                    System.out.println("Name: "
                            +element.getElementsByTagName("Name").item(0)
                            .getTextContent());
                    System.out.println("Value: "
                            +element.getElementsByTagName("Value").item(0)
                            .getTextContent());
                }
            }

        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}

