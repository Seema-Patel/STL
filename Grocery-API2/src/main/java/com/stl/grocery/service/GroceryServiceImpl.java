package com.stl.grocery.service;

import java.util.List;

import org.apache.commons.csv.CSVRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stl.grocery.csvloading.CsvLoading;

@Service
public class GroceryServiceImpl {
	
	@Autowired
	CsvLoading csvLoading;
	
	public List<CSVRecord> saveGroceryDetails() {
		List<CSVRecord> list=csvLoading.parseCSV("Groceries_dataset1.csv");
		return list;
		
		
	}

}
