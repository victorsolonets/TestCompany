package com.joseph.controller;

import com.joseph.model.Client;
import com.joseph.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Controller
public class ClientController {
	@Autowired
	private ClientService clientService;
	
	@RequestMapping("/index")
	public String setupForm(Map<String, Object> map){
		Client client = new Client();
		map.put("client", client);
		map.put("clientList", clientService.getAllClient());
		return "client";
	}
	@RequestMapping(value="/client.do", method=RequestMethod.POST)
	public String doActions(@ModelAttribute Client client, BindingResult result, @RequestParam String action, Map<String, Object> map){
		Client clientResult = new Client();
		switch(action.toLowerCase()){	//only in Java7 you can put String in switch
		case "add":
			clientService.add(client);
			clientResult = client;
			break;
		case "edit":
			clientService.edit(client);
			clientResult = client;
			break;
		case "delete":
			clientService.delete(client.getClientId());
			clientResult = new Client();
			break;
		case "search":
			Client searchedClient = clientService.getClient(client.getClientId());
			clientResult = searchedClient !=null ? searchedClient : new Client();
			break;
		}
		map.put("client", clientResult);
		map.put("clientList", clientService.getAllClient());
		return "client";
	}

	@RequestMapping(value = "/ajaxtest", method = RequestMethod.POST)
	@ResponseBody
	public Set<String> ajaxTest() {
		Set<String> records = new HashSet<String>();
		records.add("Record #1");
		records.add("Record #2");

		return records;
	}
}
