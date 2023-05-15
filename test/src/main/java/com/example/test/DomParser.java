package com.example.test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


public class DomParser {
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
//		DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
//		DocumentBuilder builder=factory.newDocumentBuilder();
//		//Document document=builder.parse(new File("logger.xml"));
//		Document document=builder.parse(new File("D:\\STS\\test\\test\\src\\main\\resources\\Input\\logger.xml"));
//		List<logger>list=new ArrayList<logger>();
//		NodeList nodeList=document.getDocumentElement().getChildNodes();
//		for(int i=0;i<nodeList.getLength();i++)
//		{
//			Node node=nodeList.item(i);
//			if(node.getNodeType()==node.ELEMENT_NODE)
//			{
//				Element ele=(Element)node;
//				String level = node.getAttributes().getNamedItem("level").getNodeValue();
//				String message = node.getAttributes().getNamedItem("message").getNodeValue();
//				list.add(new logger(level,message));
//			}
//		}
//		 for(logger ele: list)
//             System.out.println(ele.toString());
	}
}
