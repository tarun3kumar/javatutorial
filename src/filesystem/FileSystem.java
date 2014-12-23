package filesystem;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import java.util.Properties;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import org.xml.sax.SAXException;

public class FileSystem {

    public static void main(final String[] args) throws IOException, ParserConfigurationException, SAXException {

        // retrieving absolute path of a file
        System.out.println("###############################################");
        System.out.println("###############################################");

        Path path = Paths.get(".gitignore");
        System.out.println("absolute file path to '.gitignore' file is: " + path.toAbsolutePath());

        // copy file to a new location
        File sourceFile = new File("sample1.txt");
        File destinationFile = new File("samplle2.txt"); // java creates this non existing file
        Files.copy(sourceFile.toPath(), destinationFile.toPath());
        // delete sample2.txt file after running this program else subsequent runs would fail

        // reading from file
        System.out.println("###############################################");
        System.out.println("###############################################");
        System.out.println("Reading from file");

        InputStream inputStream = Files.newInputStream(Paths.get("sample1.txt").toAbsolutePath());
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String line = null;
        while (((line = bufferedReader.readLine()) != null)) {
            System.out.println("line is: " + line);
        }

        // reading from property file
        System.out.println("###############################################");
        System.out.println("###############################################");
        System.out.println("Reading from properties file");

        Properties properties = new Properties();
        InputStream inputStream1 = new FileInputStream("config.properties");
        properties.load(inputStream1);
        System.out.println("URL is: " + properties.getProperty("url"));
        System.out.println("Browser is: " + properties.getProperty("browser"));
        System.out.println("Browser is: " + properties.getProperty("operatingsystem"));

        // reading xml file
        System.out.println("###############################################");
        System.out.println("###############################################");
        System.out.println("Reading from xml file");

        File xmlFile = new File(Paths.get("staff.xml").toAbsolutePath().toString());
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        Document document = documentBuilder.parse(xmlFile);
        System.out.println("Root element is: " + document.getDocumentElement().getNodeName());

        NodeList nodeList = document.getElementsByTagName("staff");
        System.out.println("staff node count: " + nodeList.getLength());
        for (int index = 0; index < nodeList.getLength(); index++) {
            System.out.println("on node: " + index);

            Node node = nodeList.item(index);
            System.out.println("staff id is: " + ((Element) node).getAttribute("id"));
            System.out.println("firstname is: "
                    + ((Element) node).getElementsByTagName("firstname").item(0).getTextContent());
            System.out.println("nickname is: "
                    + ((Element) node).getElementsByTagName("nickname").item(0).getTextContent());
        }
    }
}
