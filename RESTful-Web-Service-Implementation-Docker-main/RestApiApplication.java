package com.example.RestAPI;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.util.Iterator;

import com.example.RestAPI.domain.Customers;
import com.example.RestAPI.domain.Details;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import org.apache.catalina.mapper.Mapper;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApiApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
		
}

	@GetMapping("/customers")
	public String getCustomers()
	{
		String result="";
		try{
			JSONParser jsonParser = new JSONParser();	
			JSONObject jsonObject = (JSONObject) jsonParser.parse(new FileReader("C:/Users/neera/Downloads/RestAPI/RestAPI/src/main/resources/json/customers.json"));
			
			result = jsonObject.toJSONString();

			// create object mapper instance
			ObjectMapper mapper = new ObjectMapper();
			mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
			String json = mapper.writeValueAsString(result);

			// print pretty json
			System.out.println(json);

			// read and map the json data to customer class
			Details customers = mapper.readValue(json, Details.class);

			System.out.println(customers);
			return customers.toString();

			//#region Gson Commented code
				// Gson gson = new Gson();
				// BufferedReader reader = new BufferedReader(new FileReader("C:/Users/neera/Downloads/RestAPI/RestAPI/src/main/resources/json/customers.json"));
				// 	String line;
				// 	while ((line = reader.readLine()) != null) {
				// 		customer = gson.fromJson(line, Customer.class);
				// 	}
				// 	reader.close();
			//#endregion
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return result;

	}
}
