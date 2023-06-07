package com.stl.grocery;

import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.csv.CSVRecord;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.stl.grocery.csvloading.CsvLoading;
import com.stl.grocery.entity.*;
import com.stl.grocery.util.*;


@SpringBootApplication
public class GroceryApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(GroceryApiApplication.class, args);
		System.out.println("Grocery Project");
	
		/*
		 * CsvLoading csv =new CsvLoading(); List<CSVRecord>
		 * list=csv.parseCSV("Groceries_dataset1.csv");
		 * 
		 * List<Grocery> csvList=list.stream().map((rec
		 * )->GroceryRecordUtil.parseGroceryRecord(rec)).collect(Collectors.toList());
		 * System.out.println(csvList);
		 */
		System.out.println("Grocery Records");
		
	}

}
