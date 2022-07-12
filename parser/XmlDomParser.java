package com.example.parser;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XmlDomParser {


	public static List<Entry> parse(String fileName) throws Exception {
		
	
			List<Entry> entries = new ArrayList<Entry>();
			File xmlDoc = new File(fileName);
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = factory.newDocumentBuilder();
			Document doc = db.parse(xmlDoc);
			
			//Read root element
			System.out.println("Root element: "+doc.getDocumentElement().getNodeName());
			
			//Read array of feed entry, this array is called NodeList
			
			NodeList nList = doc.getElementsByTagName("entry");
			System.out.println("nList.getLength(): "+nList.getLength());
			for(int i=0; i<nList.getLength(); i++)
			{
				Node node = nList.item(i);
				//System.out.println("Node name:- " +node.getNodeName()+ " " + (i+1));
				
				if(node.getNodeType() == Node.ELEMENT_NODE)
				{
					Element eElement1 = (Element) node;
					Entry entry = new Entry();
					
					entry.setTitle(eElement1.getElementsByTagName("title").item(0).getTextContent());
					entry.setLink(eElement1.getElementsByTagName("link").item(0).getTextContent());
					entry.setId(eElement1.getElementsByTagName("id").item(0).getTextContent());
					entry.setPublished(eElement1.getElementsByTagName("published").item(0).getTextContent());
					entry.setUpdated(eElement1.getElementsByTagName("updated").item(0).getTextContent());
					
					entries.add(entry);
					System.out.println(entry);
				}
			}
			return entries;
			
	}
}
