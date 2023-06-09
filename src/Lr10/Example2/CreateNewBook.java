package Lr10.Example2;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.Scanner;

public class CreateNewBook {
    public void newBook(){
        String filePath = "src/lr10/example2/example.xml";
        File xmlFile = new File(filePath);
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder;
        try {
            builder = factory.newDocumentBuilder();
            Document doc = builder.parse(xmlFile);
            doc.getDocumentElement().normalize();

            addElement(doc);

            doc.getDocumentElement().normalize();
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("src/lr10/example2/example.xml"));
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.transform(source, result);
            System.out.println("XML успешно изменен!");

        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }

     private void addElement(Document doc) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название книги: ");
        String bookName = scanner.nextLine();
        System.out.println("Введите ФИО автора: ");
        String authorName = scanner.nextLine();
        System.out.println("Введите год выпуска: ");
        String yearUser = scanner.nextLine();

        NodeList library = doc.getElementsByTagName("Library");
        Element lang = null;

        for(int i=0; i<library.getLength(); i++){
            lang = (Element) library.item(i);
            Element book = doc.createElement("book");
            lang.appendChild(book);

            Element title = doc.createElement("title");
            title.appendChild(doc.createTextNode(bookName));
            book.appendChild(title);

            Element author = doc.createElement("author");
            author.appendChild(doc.createTextNode(authorName));
            book.appendChild(author);

            Element year = doc.createElement("year");
            year.appendChild(doc.createTextNode(yearUser));
            book.appendChild(year);
        }
    }
}
