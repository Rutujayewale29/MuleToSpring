package com.example.test;

import java.io.File;
import java.io.IOException;
import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

@SpringBootApplication
public class TestApplication {
	private static final String FILENAME = "D:\\STS\\test\\test\\src\\main\\resources\\Input\\muleflow.xml";
	//private static final String FILENAME = "D:\\STS\\test\\test\\src\\main\\resources\\Input\\mulelogger.xml";
	public static void main(String[] args) {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		try
		{
			dbf.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);
			DocumentBuilder db = dbf.newDocumentBuilder();
	          Document doc = db.parse(new File(FILENAME));
	          doc.getDocumentElement().normalize();
	          //for mule
	          System.out.println("Root Element :" + doc.getDocumentElement().getNodeName());
	          NodeList list = doc.getElementsByTagName("flow");//for flow
	          for (int temp = 0; temp < list.getLength(); temp++) {
	        	  Node node = list.item(temp);
	        	  if (node.getNodeType() == Node.ELEMENT_NODE) {
	        		  Element element = (Element) node;
	        		  String name = element.getAttribute("name");
                        //for http:listener
	        		  NodeList httpListenerNodeList = element.getElementsByTagName("httpListener");
	        		  String httpListener = httpListenerNodeList.item(temp).getTextContent();
	        		  System.out.println(httpListener);
	        		  //get Attributes from httpListener
	        		  String configRef = httpListenerNodeList.item(2).getAttributes().getNamedItem("configRef").getTextContent();
	        		  String path = httpListenerNodeList.item(3).getAttributes().getNamedItem("path").getTextContent();
	        		  //for logger
	        		  NodeList loggerNodeList = element.getElementsByTagName("logger");
	        		  String logger = loggerNodeList.item(1).getTextContent();
	        		  //get attributes from logger
	        		  String level = loggerNodeList.item(1).getAttributes().getNamedItem("level").getTextContent();
	        		  String message = loggerNodeList.item(3).getAttributes().getNamedItem("message").getTextContent();
	        		  //for set:payload
	        		  NodeList setPayloadNodeList = element.getElementsByTagName("setPayload");
	        		  String setPayload = setPayloadNodeList.item(1).getTextContent();
	        		  //get Attributes from set:payload
	        		  String value = setPayloadNodeList.item(1).getAttributes().getNamedItem("value").getTextContent();
	        		  //for logger
	        		  NodeList logger1NodeList = element.getElementsByTagName("logger1");
	        		  String logger1 = logger1NodeList.item(1).getTextContent();
	        		  //get attributes from logger1
	        		  String level1 = logger1NodeList.item(1).getAttributes().getNamedItem("level1").getTextContent();
	        		  String message1 = logger1NodeList.item(3).getAttributes().getNamedItem("message1").getTextContent();
	        		  //printing all nodes with its attributes
	        		  System.out.println(node.getNodeName());
	        		  System.out.println("flow : " + name);
	                  //System.out.println("name : " + name);
	                  //System.out.println("http:listener : " + httpListener);
	                  System.out.println(node.getNodeName());
	                  System.out.println("configRef : " + configRef);
	                  System.out.println("path : " + path);
	                  //System.out.println("logger : ");
	                  System.out.println(node.getNodeName());
	                  System.out.println("level : " + level);
	                  System.out.println("message : " + message);
	                  //System.out.println("setPayload : ");
	                  System.out.println(node.getNodeName());
	                  System.out.println("value : " + value);
	                  //System.out.println("logger : ");
	                  System.out.println(node.getNodeName());
	                  System.out.println("level1 : " + level1);
	                  System.out.println("message1 : " +message1);
	              
	                  
	        	  }
	          }
	          
              
		}
		catch (ParserConfigurationException | SAXException | IOException e) {
	          e.printStackTrace();
	      }
	
		//SpringApplication.run(TestApplication.class, args);
//		try   
//		{  
//		//creating a constructor of file class and parsing an XML file  
//		File file = new File("D:\\STS\\test\\test\\src\\main\\resources\\Input\\logger.xml");  
//		//an instance of factory that gives a document builder  
//		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();  
//		//an instance of builder to parse the specified xml file  
//		DocumentBuilder db = dbf.newDocumentBuilder();  
//		Document doc = db.parse(file);  
//		doc.getDocumentElement().normalize();  
//		System.out.println("Root element: " + doc.getDocumentElement().getNodeName());  
//		NodeList nodeList = doc.getElementsByTagName("logger");  
//		// nodeList is not iterable, so we are using for loop  
//		for (int itr = 0; itr < nodeList.getLength(); itr++)   
//		{  
//		Node node = nodeList.item(itr);  
//		System.out.println("\nNode Name :" + node.getNodeName());  
//		if (node.getNodeType() == Node.ELEMENT_NODE)   
//		{  
//		Element eElement = (Element) node;  
//		System.out.println("level "+ eElement.getElementsByTagName("level").item(0).getTextContent());  
//		System.out.println("doc:name "+ eElement.getElementsByTagName("docName").item(0).getTextContent());  
//		System.out.println("message: "+ eElement.getElementsByTagName("message").item(0).getTextContent());  
//		}  
//		}  
//		}   
//		catch (Exception e)   
//		{  
//		e.printStackTrace();  
//		}  

	}

}
