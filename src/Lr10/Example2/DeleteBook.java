package Lr10.Example2;

import org.w3c.dom.Document;

import java.io.File;
import java.util.Scanner;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.transform.OutputKeys;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class DeleteBook {
    public void delete(){
        try {
            System.out.println("Введите id Книги");
            Scanner sc = new Scanner(System.in);
            int numDelete = sc.nextInt()-1;
            File inputFile = new File("src/lr10/example2/example.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            NodeList nodeList = doc.getElementsByTagName("book");

            Node node = nodeList.item(numDelete);
            Element bookElement = (Element) node;
            bookElement.getElementsByTagName("title").item(numDelete);
            Node parentNode = bookElement.getParentNode();
            parentNode.removeChild(bookElement);

            doc.setXmlStandalone(true);
            doc.normalizeDocument();
            javax.xml.transform.TransformerFactory tf = javax.xml.transform.TransformerFactory.newInstance();
            javax.xml.transform.Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(OutputKeys.STANDALONE, "yes");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            javax.xml.transform.dom.DOMSource source = new javax.xml.transform.dom.DOMSource(doc);
            javax.xml.transform.stream.StreamResult result =
                    new javax.xml.transform.stream.StreamResult(new File ("src/lr10/example2/example.xml"));
            transformer.transform(source,result);

            System.out.println("Удалили книгу из списка");
        }
        catch (Exception e )
        {
            System.out.println("Ошибка удаления");
        }
    }
}
