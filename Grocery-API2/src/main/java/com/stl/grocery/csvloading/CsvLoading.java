package com.stl.grocery.csvloading;

import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.stl.grocery.entity.Grocery;
import com.stl.grocery.repository.GroceryRepository;
import com.stl.grocery.util.GroceryRecordUtil;

//import com.stl.grocey.entiy.Grocery;

@Component
public class CsvLoading {
	
	@Autowired
	GroceryRepository groceryRepository;

	public List<CSVRecord> parseCSV(String filename) {
		List<CSVRecord> al=new ArrayList<CSVRecord>();
		
		Reader reader;
		try {
			reader = new FileReader(filename);
			Iterable<CSVRecord> recordsIterable = CSVFormat.RFC4180.withFirstRecordAsHeader().parse(reader);
	        for (CSVRecord record : recordsIterable)
	        {
	        	Grocery grocery=GroceryRecordUtil.parseGroceryRecord(record);
	        	
	        	Grocery entityGrocery=groceryRepository.save(grocery);
	        	System.out.println(entityGrocery);
	        	
	            System.out.println(record);
	            al.add(record);
	        }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return al;
        }
}
