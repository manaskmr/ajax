package com.example.parser;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class ControllerLayer {

	@GetMapping("/get")
	public List<Entry> homePage() throws Exception {
		List<Entry> entries = XmlDomParser.parse("RssFeed.xml");
		System.out.println(entries);
		return entries;
	}
	
	@GetMapping("/get2")
	public Entry homePage2() {
		return new Entry();
	}
}
