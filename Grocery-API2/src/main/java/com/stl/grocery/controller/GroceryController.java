package com.stl.grocery.controller;

import java.util.List;

import org.apache.commons.csv.CSVRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stl.grocery.service.GroceryServiceImpl;

@RestController
public class GroceryController {
	
	@Autowired
	GroceryServiceImpl groceryServiceImplg;
	
	@GetMapping(value="/")
	public String saveGroceryDetails() {
		List<CSVRecord> listCSV= groceryServiceImplg.saveGroceryDetails();
		
		System.out.println(listCSV);
		return "Saved Grocery details in database successfully";
	}

}
